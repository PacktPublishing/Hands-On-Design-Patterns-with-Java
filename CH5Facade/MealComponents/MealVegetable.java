package CH5Facade.MealComponents;

public class MealVegetable {

    private String vegetable;

    public void setVegetable(String vegetable) {
        this.vegetable = vegetable;
        System.out.println("\t\tVegetable (" + this.vegetable + ") added to meal.");
    }
}
