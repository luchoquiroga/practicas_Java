import java.util.Scanner;

public class detectorDePalindromos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String fraseUser;
        StringBuilder detector = new StringBuilder();
        System.out.println("ingrese una frase y se le dira si es palindromo");
        fraseUser = sc.nextLine();
        for (int i = 0; i < fraseUser.length(); i++) {
            char letra = fraseUser.charAt(i);
            detector.append(letra);
        }
        detector.reverse();
        if (detector.toString().equals(fraseUser)){
            System.out.println("es un palindromo");
        } else {
            System.out.println("no es un palindromo");
        }


    }
}
