import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args){
        String original;
        Scanner in = new Scanner(System.in);
        System.out.println(" Entrez votre phrase et nous verrons quel mot est le plus long : ");
        original = in.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(original);
        System.out.println(stringTokenizer.countTokens());
    }
}
