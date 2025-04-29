import java.util.InputMismatchException;
import java.util.Scanner;

public class simuladorDeCuentasBancarias {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        cuentas[] cuentasBancarias = {
                new cuentas("carlos", 5000, "papulandia"),
                new cuentas("pepe", 5000, "asdasd"),
                new cuentas("roberto", 5000, "afganistan")
        };
        cuentas cuentaActual = null;
        cuentas cuentasDestino = null;
        int opcSesion = 0;
        int opc;
        String nombre , contrasena;
        boolean inicioDeSesion = false;

        while (opcSesion != 2){
            System.out.println("1- iniciar sesion");
            System.out.println("2- salir");
            opcSesion = sc.nextInt();
            sc.nextLine();
            switch (opcSesion){
                case 1:
                    System.out.println("ingrese nombre de usuario");
                    nombre = sc.nextLine();
                    System.out.println("ingrese la contraseña");
                    contrasena = sc.nextLine();
                    for (cuentas cuenta : cuentasBancarias) {
                        if (cuenta.getNombre().equals(nombre) && cuenta.getContrasena().equals(contrasena)){
                            cuentaActual = cuenta;
                            inicioDeSesion = true;
                            break;
                        }
                    }
                    if (!inicioDeSesion){
                        System.out.println("no hay una cuenta con esos parametros");
                    }
                    break;
                case 2:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("ingrese una opcion valida");
                    break;
            }
            while (inicioDeSesion){
                System.out.println("Bienvenido " + cuentaActual.getNombre() + " $" + cuentaActual.getSaldo());
                System.out.println("---------------------------------------------------------------");
                System.out.println("[Menú]----------");
                System.out.println("1-Deposito");
                System.out.println("2-Retiro");
                System.out.println("3-Transferencia");
                System.out.println("4-Cerrar Sesion");
                opc = sc.nextInt();
                int opcMov;
                int i;
                double monto ;
                switch (opc){
                    case 1:
                        System.out.println("cuanto desea depositar?");
                        monto = sc.nextDouble();
                        try{
                            if (monto > 0){
                                cuentaActual.deposito(monto);
                                System.out.println("el deposito ha sido efectuado");
                            } else {
                                throw new IllegalArgumentException("el deposito no puede ser 0 o menor");
                            }
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        } catch (InputMismatchException e){
                            System.out.println("Error debe ingresar un número");
                        }
                        break;
                    case 2:
                        System.out.println("cuanto desea retirar?" + cuentaActual.getSaldo());
                        monto = sc.nextDouble();
                        try{
                            if (monto < cuentaActual.getSaldo()){
                                cuentaActual.retiro(monto);
                                System.out.println("retiro efectuado");
                            } else {
                                throw new IllegalArgumentException("el retiro es mayor al saldo");
                            }
                        } catch (IllegalArgumentException e){
                            System.out.println(e.getMessage());
                        } catch (InputMismatchException e){
                            System.out.println("Error debe ingresar un número");
                        }
                        break;
                    case 3:
                        i = 1;
                        for (cuentas personas : cuentasBancarias) {
                            if (!personas.getNombre().equals(cuentaActual.getNombre())){
                                System.out.println( i + "-" + personas.getNombre());
                                i++;
                            }
                        }
                        System.out.println("A quien desea pasarle dinero?");
                        opcMov = sc.nextInt();
                        i = 0;
                        for (cuentas personas : cuentasBancarias) {
                            if (!personas.getNombre().equals(cuentaActual.getNombre())) {
                                i += 1;
                                if (i == opcMov) {
                                    cuentasDestino = personas;
                                    break;  // Salimos del bucle una vez que encontramos la cuenta destino
                                }
                            }
                        }

                        if (cuentasDestino != null) {
                            System.out.println("Cuánto desea pasarle?");
                            monto = sc.nextDouble();
                            try {
                                if (monto > 0 && monto <= cuentaActual.getSaldo()) {
                                    cuentaActual.transferencia(cuentasDestino, monto);
                                    System.out.println("Transferencia efectuada");
                                } else {
                                    throw new IllegalArgumentException("El monto es mayor al saldo o menor a 0");
                                }
                            } catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage());
                            } catch (InputMismatchException e) {
                                System.out.println("Error: debe ingresar un número");
                            }
                        } else {
                            System.out.println("Opción inválida, por favor seleccione un número correcto.");
                        }
                        break;
                    case 4:
                        System.out.println("adios usuario");
                        cuentaActual = null;
                        inicioDeSesion = false;
                        break;
                }
            }
        }
    }
}
