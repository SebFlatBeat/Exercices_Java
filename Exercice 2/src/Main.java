import java.util.Scanner;

public class Main {

    public static void main (String [] args) {
        int[] tab = new int[8];
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre un nombre : ");
        int val = sc.nextInt();
        Tableau tableau = new Tableau();
        System.out.println(tableau.occurence(tab,val));
    }
}
