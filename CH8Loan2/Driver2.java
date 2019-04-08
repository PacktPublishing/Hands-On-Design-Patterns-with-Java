package CH8Loan2;

public class Driver2 {

    public static void main(String[] args) {

        FileToProcess2.processFile(theFile -> theFile.processMetaData()
                .analyzeHeader().checkSpelling().checkGrammar());
    }
}
