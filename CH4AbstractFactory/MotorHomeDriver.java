package CH4AbstractFactory;

public class MotorHomeDriver {

    public static void main(String[] args) {

        // Step 1
        // create abstract factory
        MotorHomeAbstractFactory mhFactory = null;

        // Step 2
        // Create a factory instance
        String nextMotorHome = "TypeA"; // simulated user input

        if (nextMotorHome.equals("TypeA")) {
            System.out.println("\nType A motor home selected");
            mhFactory = new TypeAFactory();
        } else if (nextMotorHome.equals("TypeB")) {
            System.out.println("\nType B motor home selected");
            mhFactory = new TypeBFactory();
        } else if (nextMotorHome.equals("TypeC")) {
            System.out.println("\nType C motor home selected");
            mhFactory = new TypeCFactory();
        } else {
            System.out.println("Invalid motor home type entered.");
        }

        // Step 3
        // Create motor home components
        Style mhStyle = mhFactory.createStyle();
        Frame mhFrame = mhFactory.createFrame();
        Engine mhEngine = mhFactory.createEngine();
        Kitchen mhKitchen = mhFactory.createKitchen();

        // Step 4
        // Provide Output
        System.out.println("\nComponent list for " + nextMotorHome + " motor home");
        System.out.println(mhStyle.getStyle());
        System.out.println(mhFrame.getFrame());
        System.out.println(mhEngine.getEngine());
        System.out.println(mhKitchen.getKitchen());
    }
}
