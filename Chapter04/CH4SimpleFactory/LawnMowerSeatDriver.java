package CH4SimpleFactory;

public class LawnMowerSeatDriver {

    public static void main(String[] args) {

        System.out.println("\n\n");

        // Create a Residential Lawnmower Seat
        LawnMowerSeat residential = LawnMowerSeatFactory.create(LawnMowerSeatFactory.LawnMowerType.RESIDENTIAL);

        // Create a Commercial Lawnmower Seat
        LawnMowerSeat commercial = LawnMowerSeatFactory.create(LawnMowerSeatFactory.LawnMowerType.COMMERCIAL);

    }
}
