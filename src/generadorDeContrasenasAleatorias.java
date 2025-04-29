import java.util.Scanner;
import java.util.Random;

public class generadorDeContrasenasAleatorias {
    public static void main(String[] args){
        char[] letras = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] numeros = "0123456789".toCharArray();
        char[] simbolos = "!@#$%^&*()-_=+[]{};:'\",.<>?/\\\\|`~".toCharArray();
        boolean validacion = false;
        int rango;
        int rangoMinimo;
        int rangoMaximo;
        Scanner sc = new Scanner(System.in);
        Random ram = new Random();
        StringBuilder contrasena = new StringBuilder();
        char caracter;
        boolean tieneLetra = false, tieneNumero = false, tieneSimbolo = false;

        System.out.println("ingrese un rango minimo y uno maximo del cual desea generar la contraseña");
        System.out.println("rango minimo (minimo 8)");
        rangoMinimo = sc.nextInt();
        System.out.println("rango maximo (minimo 9)");
        rangoMaximo = sc.nextInt();
        if (rangoMinimo < 8 || rangoMaximo < 9 || rangoMinimo > rangoMaximo){
            rangoMinimo = 8;
            rangoMaximo = 9;
        }
        rango = ram.nextInt(rangoMinimo, rangoMaximo);
        System.out.println("la contraseña sera de una longitud de: " + rango);
        while (!validacion){
            for (int i = 0; i < rango; i++) {


                char[][] opciones = {letras, numeros, simbolos};
                char[] seleccion = opciones[ram.nextInt(opciones.length)];
                caracter = seleccion[ram.nextInt(seleccion.length)];
                contrasena.append(caracter);
            }
            for (int i = 0; i < contrasena.length(); i++) {
                char letra = contrasena.charAt(i);

                if (comprobacion(letras, letra)) tieneLetra = true;
                if (comprobacion(numeros, letra)) tieneNumero = true;
                if (comprobacion(simbolos, letra)) tieneSimbolo = true;
            }
            if (tieneLetra && tieneSimbolo && tieneNumero){
                validacion = true;
                System.out.println("la contraseña es: " +  contrasena);
            }else{
                contrasena.setLength(0);
                tieneLetra = false;
                tieneNumero = false;
                tieneSimbolo = false;
            }
        }
        sc.close();
    }
    public static boolean comprobacion(char[] array, char c ){
        for (int i = 0; i < array.length; i++) {
            if (c == array[i]){
                return true;
            }
        }
        return false;
    }
}
