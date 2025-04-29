import java.util.Scanner;

public class ContadorDeVocalesYConsonantes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        char[] consonantes = {
                'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z',
                'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'
        };
        String frase;
        int contadorVocales = 0, contadorConsonantes = 0;
        System.out.println("ingrese una frase, se le contaran las vocales y consonantes");
        frase = sc.nextLine();
        sc.nextLine();
        for (int i = 0; i < frase.length(); i++) {
            char caracter =  frase.toLowerCase().charAt(i);
            if (comprobacion(vocales, caracter)) contadorVocales += 1;
            if (comprobacion(consonantes, caracter)) contadorConsonantes += 1;
        }
        System.out.println("la cantidad de vocales es de: " + contadorVocales);
        System.out.println("la cantidad de consonantes es de: " + contadorConsonantes);
    }

    public static boolean comprobacion(char[] array, char c ){
        for(int i = 0; i < array.length; i++) {
            if (c == array[i]){
                return true;
            }
        }
        return false;
    }
}
