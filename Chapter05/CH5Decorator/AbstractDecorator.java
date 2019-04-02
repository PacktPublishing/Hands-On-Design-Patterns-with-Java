package CH5Decorator;

abstract class AbstractDecorator extends Printer {

    protected Printer printer;

    public void selectPrinterToFlush(Printer ptr) {
        printer = ptr;
    }

    public void flushBuffer() {
        if (printer != null) {
            printer.flushBuffer();
        }
    }
}
