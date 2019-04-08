package CH8TailCall;

import java.util.Scanner;

public class TailCallExample {

    public static int theInitialNumber;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("\n\nI can turn your number into 7.");
        System.out.print("Enter a number: ");
        theInitialNumber = in.nextInt();

        // Display system header
        System.out.println("\n=========================");
        System.out.println("ANY NUMBER CAN BE LUCKY 7");
        System.out.println("=========================");

        System.out.println("\nThe intial number: " + theInitialNumber);

        System.out.println("The tail call sent this as the result: " +
                (excecuteThisMethod(theInitialNumber))); // tail call
    }

    private static int excecuteThisMethod(int theNumber) {

        int funWithNumbers;

        funWithNumbers = operation1(theNumber);

        funWithNumbers = operation2(funWithNumbers);

        funWithNumbers = operation3(funWithNumbers);

        funWithNumbers = operation4(funWithNumbers);

        funWithNumbers = operation5(funWithNumbers); // tail call

        return(funWithNumbers);
    }

    private static int operation1(int theNbr) {
        System.out.println("\t+ 9 = " + (theNbr + 9)); // tail call
        return theNbr + 9;
    }
    private static int operation2(int theNbr) {
        System.out.println("\t* 2 = " + (theNbr * 2)); // tail call
        return theNbr * 2;
    }
    private static int operation3(int theNbr) {
        System.out.println("\t- 4 = " + (theNbr - 4)); // tail call
        return theNbr - 4;
    }
    private static int operation4(int theNbr) {
        System.out.println("\t/ 2 = " + (theNbr / 2)); // tail call
        return theNbr / 2;
    }
    private static int operation5(int theNbr) {
        System.out.println("\t- initial number = " + (theNbr - theInitialNumber)); // tail call
        return (theNbr - theInitialNumber);
    }
}
