import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int saldo = 5000;
        int dinero, opc = 1;

        while (opc != 4){
            System.out.println("[Menú]--------------");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.println("Ingrese su opción");
            try{
                opc = sc.nextInt();
                switch (opc){
                    case 1:
                        System.out.println("Consultar Saldo-----");
                        System.out.println("Su saldo actual es de: " + saldo);
                        break;
                    case 2:
                        System.out.println("Depositar----");
                        System.out.println("Ingrese la cantidad a depositar");
                        dinero = sc.nextInt();
                        if (dinero <= 0){
                            throw new IllegalArgumentException("El deposito no puede ser 0 o menor a 0");
                        }
                        saldo += dinero;
                        System.out.println("Deposito realizado, su nuevo saldo es de: " + saldo);
                        break;
                    case 3:
                        System.out.println("Retirar-----");
                        System.out.println("Ingrese la cantidad a retirar");
                        dinero = sc.nextInt();
                        if (dinero > saldo) {
                            throw new IllegalArgumentException("El dinero a retirar es mayor a del saldo disponible");
                        }
                        saldo -= dinero;
                        System.out.println("Retiro realizado, su nuevo saldo es de: " + saldo);
                        break;
                    case 4:
                        System.out.println("adios");
                        break;
                    default:
                        System.out.println("Ingrese una opción valida");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e){
                System.out.println("Error debe ingresar un número valido");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
