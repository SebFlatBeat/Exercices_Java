public class Tableau {

     int Occurence(int[] tab, int val) {

        for (int i = 0; i != tab.length; i++) {
            if (tab[i] == val)
                return i;
        }
        return -1;
    }
}
