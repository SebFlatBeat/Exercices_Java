public class lesMultiples {
    public static String isDivisibleBy3and5(int nb) {
        if (nb != 0 && (nb % 3 == 0) && (nb % 5 == 0)) {
            System.out.println("BuzzFizz");
        } else {
            if (nb != 0 && (nb % 3 == 0)) {
                System.out.println("Fizz");
            }
            if (nb != 0 && (nb % 5 == 0)) {
                System.out.println("Buzz");
            }
        }
        return null;
    }
}