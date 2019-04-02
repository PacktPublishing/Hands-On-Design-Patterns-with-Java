package CH5Decorator;

public class DecoratorDriver {

    public static void main(String[] args) {

        System.out.println("\n\n======================================================");
        System.out.println("\t\t\tPrinter Buffer Flusher Demo");
        System.out.println("======================================================");
        ConcretePrinter concreteFlush = new ConcretePrinter();

        // create concrete decorator
        ConcreteDecorator1 cd1 = new ConcreteDecorator1();
        // decorate cd1
        cd1.selectPrinterToFlush(concreteFlush);
        cd1.flushBuffer();

        // create concrete decorator
        ConcreteDecorator2 cd2 = new ConcreteDecorator2();
        // decorate cd2
        cd2.selectPrinterToFlush(cd1);
        cd2.flushBuffer();
    }
}
