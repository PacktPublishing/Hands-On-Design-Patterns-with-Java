package CH8Loan2;

import java.util.function.Consumer;

public class FileToProcess2 {

    // constructor
    protected FileToProcess2() {
        openFile();
    }

    public static void processFile(final Consumer<FileToProcess2> block) {
        final FileToProcess2 theFile = new FileToProcess2();

        block.accept(theFile);

        theFile.closeFile();
    }


    public FileToProcess2 openFile() {
        System.out.println("\nFile opened for processing by constructor");
        return this;
    }

    public FileToProcess2 processMetaData() {
        System.out.println("\tProcessing metadata. . .");
        return this;
    }

    public FileToProcess2 analyzeHeader() {
        System.out.println ("\tAnalyzing header. . .");
        return this;
    }

    public FileToProcess2 checkSpelling() {
        System.out.println("\tChecking spelling. . . ");
        return this;
    }

    public FileToProcess2 checkGrammar() {
        System.out.println("\tChecking grammar. . . ");
        return this;
    }

    public void closeFile() {
        System.out.println("File closed");
    }
}
