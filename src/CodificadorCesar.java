import java.util.Scanner;

public class CodificadorCesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mensaje;
        StringBuilder mensajeCifrado = new StringBuilder();
        StringBuilder mensajeDeco = new StringBuilder();
        int clave;
        char[] viA = new char[28];
        viA[0] = 'a' ; viA[14] = 'ñ';
        viA[1] = 'b' ; viA[15] = 'o';
        viA[2] = 'c' ; viA[16] = 'p';
        viA[3] = 'd' ; viA[17] = 'q';
        viA[4] = 'e' ; viA[18] = 'r';
        viA[5] = 'f' ; viA[19] = 's';
        viA[6] = 'g' ; viA[20] = 't';
        viA[7] = 'h' ; viA[21] = 'u';
        viA[8] = 'i' ; viA[22] = 'v';
        viA[9] = 'j' ; viA[23] = 'w';
        viA[10] = 'k' ; viA[24] = 'x';
        viA[11] = 'l' ; viA[25] = 'y';
        viA[12] = 'm' ; viA[26] = 'z';
        viA[13] = 'n' ; viA[27] = ' ';

        System.out.println("ingrese un mensaje");
        mensaje = sc.nextLine();
        System.out.println("ingrese una clave");
        clave = sc.nextInt();
        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);
            for (int j = 0; j < viA.length; j++) {
                if (caracter == viA[j] && j+clave >= viA.length){
                    int resto = (j+clave)%viA.length;
                    mensajeCifrado.append(viA[resto]);
                    break;
                } else if (caracter == viA[j]){
                    mensajeCifrado.append(viA[j+clave]);
                }
            }
        }

        for (int i = 0; i < mensajeCifrado.length(); i++) {
            char caracter = mensajeCifrado.charAt(i);
            for (int j = 0; j < viA.length; j++) {
                if (caracter == viA[j] && j-clave < 0){
                    int resto = (j - clave % viA.length + viA.length) % viA.length;
                    mensajeDeco.append(viA[resto]);
                    break;
                } else if (caracter == viA[j]){
                    mensajeDeco.append(viA[j-clave]);
                }
            }
        }

        System.out.println("el mensaje cifrado es: " + mensajeCifrado);
        System.out.println(mensajeDeco);
        sc.close();
    }
}
