package CH8Fibonacci1;

public class FibonacciTest1 {

    public static int computeFibonacciNumber(int number) {

        // this checks for the fibonacci base of 0 and 1
        if ( (number == 0) || ( number == 1) ) {
            return number;
        }

        System.out.println("Computing computeFibonacciNumber(int " + number + ")...");

        return (computeFibonacciNumber(number - 1)) + (computeFibonacciNumber(number - 2));
    }

    public static void main(String[] args) {

        System.out.println();
        computeFibonacciNumber(30);
    }
}
