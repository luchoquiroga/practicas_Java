import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int maximo = 0;
        int minimo = 999999999;
        double promedio = 0;
        double diferencia ;

        int cercano = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ingrese un numero en la posicion:" + i);
            numeros[i] = sc.nextInt();
            promedio = promedio + numeros[i];
        }
        promedio = promedio / numeros.length;
        double menorDiferencia = 999999;

        for (int i = 0; i < numeros.length; i++) {
            maximo = Math.max(maximo,numeros[i]);
            minimo = Math.min(minimo,numeros[i]);
            diferencia = Math.abs(numeros[i] - promedio);
            if (diferencia < menorDiferencia){
                menorDiferencia = diferencia;
                cercano = numeros[i];
            }
        }

        System.out.println("el mayor: " + maximo);
        System.out.println("el menor: " + minimo);
        System.out.println("el promedio: " + promedio);
        System.out.println("el numero mas cercano al promedio:" + cercano );

        sc.close();
    }

}
