import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        int opcMenu = 1;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        while (opcMenu != 4 ){
            System.out.println("[Menú]----------------");
            System.out.println("1-Hamburguesa - $500");
            System.out.println("2-Pizza - $800");
            System.out.println("3-Ensalada - $600");
            System.out.println("4-Salir");
            System.out.println("ingrese su opcion");
            opcMenu = sc.nextInt();
            switch (opcMenu){
                case 1:
                    System.out.println("hamburguesa añadida correctamente");
                    total += 500;
                    break;
                case 2:
                    System.out.println("Pizza anadida correctamente");
                    total += 800;
                    break;
                case 3:
                    System.out.println("Ensalada añadida correctamente");
                    total += 600;
                    break;
                case 4:
                    System.out.println("tiene que abonar: " + total);
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("ingrese una opcion valida");
            }

        }
    }
}
