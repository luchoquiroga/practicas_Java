import java.util.Scanner;
import java.util.Arrays;


public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("ingrese un numero");
        numero = sc.nextInt();

        int [][] matriz = new int[numero][numero];
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                if (i == j){
                    matriz[i][j] = 1;
                }else {
                    matriz[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(matriz));
        sc.close();
    }
}
