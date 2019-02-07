import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char reponse = 'O';
        Scanner sc = new Scanner(System.in);
        while (reponse == 'O') {
            System.out.println("Choisissez votre nombre : ");
            int nb = sc.nextInt();
            lesMultiples lesmultiples = new lesMultiples();
            lesmultiples.isDivisibleBy3and5(nb);
            reponse = ' ';
            while (reponse != 'O' && reponse != 'N') {
                System.out.println("Voulez-vous réessayez ? (O/N)");
                reponse = sc.next().charAt(0);
            }
            System.out.println("Merci, au revoir !");
        }
    }
}

