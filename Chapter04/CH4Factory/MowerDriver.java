package CH4Factory;

public class MowerDriver {

    public static void main(String[] args) {

        // output header
        System.out.println("\n\nMOWER SELECTION HELPER");

        // create first mower
        MowerFactory mowerFactory = new ConcreteMowerFactory();
        Mower rideIt = mowerFactory.getMowerType("Riding");
        rideIt.mow();

        // create second mower
        Mower pushIt = mowerFactory.getMowerType("Push");
        pushIt.mow();
    }
}
