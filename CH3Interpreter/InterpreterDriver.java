package CH3Interpreter;

import java.util.Scanner;

public class InterpreterDriver {

    // class variables
    public Conversion originatingContent = null;
    public Expression theExpression = null;

    public InterpreterDriver(Conversion content) {
        originatingContent = content;
    }

    public void interpret(String tString) {

        Scanner in = new Scanner(System.in);
        theExpression = new MapIntToCharacters(tString);
        theExpression.interpret(originatingContent);
    }

    public static void main(String[] args) {
        System.out.println("\n\nCODE INTERPRETER\n");
        System.out.print("Enter your code: ");
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();
        System.out.println("Your code: " + userInput);
        Conversion conversion = new Conversion(userInput);
        InterpreterDriver userCode = new InterpreterDriver(conversion);
        userCode.interpret(userInput);
        System.out.println("\n\n");
    }
}
