package CH4SimpleFactory;

public class LawnMowerSeatFactory {

    public enum LawnMowerType {RESIDENTIAL, COMMERCIAL};

    public static LawnMowerSeat create(LawnMowerType mowerType) {
        if (mowerType == LawnMowerType.RESIDENTIAL) {
            return new ResidentialLawnMowerSeat();
        } else if (mowerType == LawnMowerType.COMMERCIAL) {
            return new CommercialLawnMowerSeat();
        } else {
            return null;
        }
    }
}
