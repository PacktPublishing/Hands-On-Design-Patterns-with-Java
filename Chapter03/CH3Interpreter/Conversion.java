package CH3Interpreter;

public class Conversion {

    // class variable
    public String userInput;

    // constructor
    public Conversion(String userInput) {
        this.userInput = userInput;
    }

    public void convertToCharacters(String userInput) {

        this.userInput = userInput;

        System.out.print("Decrypted Message: ");
        char answer[] = userInput.toCharArray();

        for (int i=0; i < answer.length; i++) {
            switch (answer[i]) {
                case '0':
                    System.out.print("A");
                    break;
                case '1':
                    System.out.print("E");
                    break;
                case '2':
                    System.out.print("I");
                    break;
                case '3':
                    System.out.print("Y");
                    break;
                case '4':
                    System.out.print("O");
                    break;
                case '5':
                    System.out.print("L");
                    break;
                case '6':
                    System.out.print("R");
                    break;
                case '7':
                    System.out.print("T");
                    break;
                case '8':
                    System.out.print("C");
                    break;
                case '9':
                    System.out.print("S");
                    break;
            }
        }
    }
}
