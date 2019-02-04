import java.util.Scanner;

public class InvertChain {

    public static void main(String[] args) {
        char reponse = 'O';
        while (reponse == 'O') {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ecrivez un mot : ");
            String initial = sc.nextLine();
            StringBuffer stringBuffer = (new StringBuffer(initial)).reverse();
            System.out.println(stringBuffer);
            reponse = ' ';
            while (reponse != 'O' && reponse != 'N') {
                System.out.println("Voulez-vous réessayez ? (O/N)");
                reponse = sc.next().charAt(0);
            }
        }
        System.out.println("Merci, au revoir !");
    }
}
