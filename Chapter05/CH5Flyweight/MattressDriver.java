package CH5Flyweight;

public class MattressDriver {

    public static void main(String[] args) throws Exception {

        MattressFactory theFactory = new MattressFactory();

        System.out.println("\n\n======================================================");
        System.out.println("\t\t\tMattress Manufacturing Factory Demo");
        System.out.println("======================================================");

        Mattress newMattress;

        for (int i = 0; i < 5; i++) {
            newMattress = (Mattress)theFactory.getFactoryMattress("Crib");
            newMattress.setMattressFirmness("Firm");
            newMattress.print();
        }

        for (int i = 0; i < 5; i++) {
            newMattress = (Mattress)theFactory.getFactoryMattress("Twin");
            newMattress.setMattressFirmness("Soft");
            newMattress.print();
        }

        for (int i = 0; i < 5; i++) {
            newMattress = (Mattress)theFactory.getFactoryMattress("Full");
            newMattress.setMattressFirmness("Extra Firm");
            newMattress.print();
        }
    }
}
