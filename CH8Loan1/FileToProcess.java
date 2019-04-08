package CH8Loan1;

public class FileToProcess {

    // constructor
    public FileToProcess() {
    }

    public FileToProcess openFile() {
        System.out.println("\nFile opened for processing");
        return this;
    }

    public FileToProcess processMetaData() {
        System.out.println("\tProcessing metadata. . .");
        return this;
    }

    public FileToProcess analyzeHeader() {
        System.out.println ("\tAnalyzing header. . .");
        return this;
    }

    public FileToProcess checkSpelling() {
        System.out.println("\tChecking spelling. . . ");
        return this;
    }

    public FileToProcess checkGrammar() {
        System.out.println("\tChecking grammar. . . ");
        return this;
    }

    public void closeFile() {
        System.out.println("File closed");
    }
}
