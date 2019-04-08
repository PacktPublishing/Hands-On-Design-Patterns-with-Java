package CH8Fibonacci2;

import java.util.Map;
import java.util.HashMap;

class FibonacciTest2 {

    private static Map<Integer, Integer> memoization = new HashMap<>();

    public static int computeFibonacciNumber(int number) {

        // this checks for the fibonacci base of 0 and 1
        if ( (number == 0) || ( number == 1) ) {
            return number;
        }

        // Step 1: Check if calculation has already been made
        if (memoization.containsKey(number)) {
            System.out.println("First time computing memoization " + number);
            return memoization.get(number);
        }

        // Step 2: Calculate if not already calculated
        System.out.println("Computing computeFibonacciNumber(int " + number + ")...");
        int fibonacciResult = (computeFibonacciNumber(number - 1)) + (computeFibonacciNumber(number - 2));

        // Step 3: Add result to Map
        memoization.put(number, fibonacciResult);

        return fibonacciResult;
    }

    public static void main(String[] args) {

        System.out.println();
        computeFibonacciNumber(7);
    }
}
