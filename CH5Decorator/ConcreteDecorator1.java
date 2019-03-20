package CH5Decorator;

public class ConcreteDecorator1 extends AbstractDecorator {

    public void flushBuffer() {
        super.flushBuffer();
        System.out.println("Message from Concrete Decorator 1: " +
                "Printer Buffer Flushed");
    }
}
