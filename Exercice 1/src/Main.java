import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char reponse = 'O';
        Scanner sc = new Scanner(System.in);
        while (reponse == 'O') {
            System.out.println("Choisissez votre nombre : ");
            int n = sc.nextInt();
            Factorial factorial = new Factorial();
            System.out.println("Le factoriel de " + n + " est " + factorial.FactorialCalcul(n));
            reponse = ' ';
            while (reponse != 'O' && reponse != 'N') {
                System.out.println("Voulez-vous réessayez ? (O/N)");
                reponse = sc.next().charAt(0);
            }
        }
        System.out.println("Merci, au revoir !");
    }
}
