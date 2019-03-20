package CH5Facade.MealComponents;

public class MealStarch {

    private String starch;

    public void setStarch(String starch) {
        this.starch = starch;
        System.out.println("\t\tStarch (" + this.starch + ") added to meal.");
    }
}
