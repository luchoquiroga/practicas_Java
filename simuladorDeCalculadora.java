import java.util.Scanner;

public class simuladorDeCalculadora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String opc = "asd";
        double num1 = 1, num2 = 1;
        while (!opc.equals("0")){
            System.out.println("[Menú]-----------");
            System.out.println("'+' suma");
            System.out.println("'-' resta");
            System.out.println("'*' multiplicación");
            System.out.println("'/' division");
            System.out.println("'%' resto de division");
            System.out.println("'0' salir");
            opc = sc.nextLine();
            if (!opc.equals("0")){
                System.out.println("ingrese el primer número");
                num1 = sc.nextInt();
                System.out.println("ingrese el segundo número");
                num2 = sc.nextInt();
            }
            switch (opc){
                case "+"-> System.out.println("la suma de los numeros es: " + (num1 + num2));
                case "-" -> System.out.println("la resta de los numeros es: " + (num1 - num2));
                case "*"-> System.out.println("la multiplicacion de los numeros es: " + (num1 * num2));
                case "/" -> {
                    if (num2 == 0){
                        System.out.println("no se puede dividir por 0");
                    }else {
                        double resultado = num1 / num2;
                        System.out.println("la division es: " + resultado);
                    }
                }
                case "%" -> System.out.println("el resto de la division es: " + (num1%num2));
                case "0" -> System.out.println("Adios");
                default -> System.out.println("ingrese una opción valida");
            }
        }
        sc.close();
    }
}
