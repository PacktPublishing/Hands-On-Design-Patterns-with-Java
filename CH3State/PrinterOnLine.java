package CH3State;

public class PrinterOnLine extends PrinterController {

    @Override
    public void pushPrint(Printer printJob) {
        System.out.println("\nClearing buffer and shutting down. . .");
        printJob.setPrinterState(new PrinterOffLine());
    }
}
