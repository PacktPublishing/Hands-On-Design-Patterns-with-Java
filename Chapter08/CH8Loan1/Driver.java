package CH8Loan1;

public class Driver {

    public static void main(String[] args) {
        FileToProcess myFile = new FileToProcess();

        myFile.openFile().processMetaData().analyzeHeader()
                .checkSpelling().checkGrammar().closeFile();
    }
}
