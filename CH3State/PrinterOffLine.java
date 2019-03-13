package CH3State;

public class PrinterOffLine extends PrinterController {

    @Override
    public void pushPrint(Printer printJob) {
        System.out.println("\nPowering printer on please wait. . .");
        printJob.setPrinterState(new PrinterOnLine());
    }
}
