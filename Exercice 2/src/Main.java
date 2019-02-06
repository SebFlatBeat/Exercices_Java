import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] tab = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        char reponse = 'O';
        Scanner sc = new Scanner(System.in);
        while (reponse == 'O') {
            System.out.println("Entre un nombre : ");
            int val = sc.nextInt();
            Tableau tableau = new Tableau();
            System.out.println(tableau.occurence(tab, val));
            reponse = ' ';
            while (reponse != 'O' && reponse != 'N') {
                System.out.println("Voulez-vous réessayez ? (O/N)");
                reponse = sc.next().charAt(0);
            }
        }
        System.out.println("Merci, au revoir !");
    }
}
