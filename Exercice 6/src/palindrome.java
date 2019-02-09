import java.util.Scanner;

public class palindrome {

    public static void main(String args[])
    {
        String original, reverse = "";
        char reponse = 'O';
        Scanner in = new Scanner(System.in);
        while (reponse == 'O') {
        System.out.println("Entrez un mot et nous allons vérifier si celui-ci est un palindrome : ");
        original = in.next();

        int length = original.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);

        if (original.equals(reverse))
            System.out.println("C'est un palindrome.");
        else
            System.out.println("Ce n'est pas un palindrome.");
            reponse = ' ';
            while (reponse != 'O' && reponse != 'N') {
                System.out.println("Voulez-vous réessayez ? (O/N)");
                reponse = in.next().charAt(0);
            }
        }
        System.out.println("Merci, au revoir !");
    }
}
