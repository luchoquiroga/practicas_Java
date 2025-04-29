import java.util.Scanner;

public class ejerciciosExtra1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double gradosFahrenheit, gradosKelvin, gradosCelsius = 1;
        while (gradosCelsius != 0){
            System.out.println("ingresa una temperatura en Celsius");
            System.out.println("y esta seria convertida a Fahrenheit y Kelvin");
            System.out.println("ingrese 0 para salir");
            gradosCelsius = sc.nextDouble();
            if (gradosCelsius > -273.15 && gradosCelsius < 5500){
                if (gradosCelsius == 0) break;
                else {
                    gradosFahrenheit = Math.round((gradosCelsius * 9/5) + 32);
                    gradosKelvin = Math.round(gradosCelsius + 273.15);
                    System.out.println("la temperatura en grados Fahrenheit: " + gradosFahrenheit);
                    System.out.println("la temperatura en grados Kelvin: " + gradosKelvin);
                }
            } else{
                System.out.println("Temperatura muy baja(debajo del cero absoluto) o muy alta (mas que la superficie del sol (~5500°C - 6000°C))");
            }
        }
        sc.close();
    }
}
