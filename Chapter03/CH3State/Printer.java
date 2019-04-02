package CH3State;

public class Printer {

    // class variable
    private PrinterController printerState;

    // constructor
    public Printer(PrinterController pState) {
        this.printerState = pState;
    }

    // accessor / getter
    public PrinterController getPrinterState() {
        return printerState;
    }

    // mutator / setter
    public void setPrinterState(PrinterController pState) {
        this.printerState = pState;
    }

    public void pushPrint() {
        printerState.pushPrint(this);
    }
}
