package CH4Builder;

public class RoasterDriver {

    public static void main(String[] args) {

        RoasterDirector roasterDirector = new RoasterDirector();

        Builder personalRoasterBuilder = new PersonalRoaster();
        Builder commercialRoasterBuilder = new CommercialRoaster();

        // Build a Personal Roaster
        roasterDirector.buildRoaster(personalRoasterBuilder);
        Roaster unit1 = personalRoasterBuilder.getRoaster();
        unit1.display();

        // Build a Commercial Roaster
        roasterDirector.buildRoaster(commercialRoasterBuilder);
        Roaster unit2 = commercialRoasterBuilder.getRoaster();
        unit2.display();
    }
}
