package CH8Lambda2;

import java.util.Random;
import java.util.Scanner;

public class Driver {

    interface FirstFunctionalInterface {
        int calculation(int a, int b);
    }

    interface SecondFunctionalInterface {
        void displayResults(String message);
    }

    private int calculate(int a, int b, FirstFunctionalInterface firstObject) {
        return firstObject.calculation(a, b);
    }

    public static void main(String[] args) {

        // Obtain user input
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.println("How many blue tokens do you have to exchange: ");
        int blueTokens = in.nextInt();
        System.out.println("How many red tokens do you have to exchange: ");
        int redTokens = in.nextInt();

        // Display system header
        System.out.println("\n======================");
        System.out.println("TOKEN-TO-GIFT EXCHANGE");
        System.out.println("======================");

        // add blue and red tokens
        FirstFunctionalInterface sum = (int nbr1, int nbr2) -> nbr1 + nbr2;

        FirstFunctionalInterface superSquare = (int nbr1, int nbr2) ->
                ((nbr1 * nbr1) + (nbr2 * nbr2));

        Driver firstObject = new Driver();

        // Generate output
        System.out.println(blueTokens + " blue tokens submitted");
        System.out.println(redTokens + " red tokens submitted");
        System.out.println(firstObject.calculate(blueTokens, redTokens, sum) +
                " total tokens submitted");

        System.out.println(firstObject.calculate(blueTokens, redTokens, superSquare) +
                " SuperSquare number result");

        System.out.println("==");
        SecondFunctionalInterface secondObject = message ->
                System.out.println("Your gift is a pound of " + message);

        secondObject.displayResults(selectGift());
    }

    public static String selectGift() {
        String[] giftArray = new String[]
                {"Gold", "Silver", "Platinum", "Titanium", "Copper"};
        Random giftNumber = new Random();
        int giftToGive = giftNumber.nextInt(4);

        return giftArray[giftToGive];
    }
}
