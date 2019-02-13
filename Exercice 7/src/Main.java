import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String original;
        Scanner in = new Scanner(System.in);
        System.out.println(" Entrez votre phrase et nous verrons quel mot est le plus long : ");
        original = in.nextLine();
        String[] word = original.split(" ");
        String bigWord = "";
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() >= bigWord.length()) {
                bigWord = word[i];
            }
        }
        System.out.println(bigWord);
    }
}

