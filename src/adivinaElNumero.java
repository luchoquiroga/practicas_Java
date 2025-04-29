import java.util.Scanner;
import java.util.Random;

public class adivinaElNumero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random ram = new Random();
        int numRam, numUser = 0, intentos = 0;
        numRam = ram.nextInt(0, 100);
        System.out.println("Debes adivinar un número aleatorio entre 0 y 99. Se te darán pistas si es mayor o menor");
        while (intentos < 10){
            System.out.println("intento: " + (intentos+1) + "/10 ingrese un número;");
            numUser = sc.nextInt();
            if (numUser < numRam){
                System.out.println("más alto");
            } else if (numUser > numRam){
                System.out.println("más bajo");
            } else {
                break;
            }
            intentos += 1;
        }
        if (numUser == numRam){
            System.out.println("victoria");
        } else {
            System.out.println("derrota, el número era: " + numRam);
        }
        sc.close();
    }
}
