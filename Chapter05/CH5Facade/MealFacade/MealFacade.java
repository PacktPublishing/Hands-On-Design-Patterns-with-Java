package CH5Facade.MealFacade;

import CH5Facade.MealComponents.MealProtein;
import CH5Facade.MealComponents.MealVegetable;
import CH5Facade.MealComponents.MealStarch;

public class MealFacade {

    MealProtein newProtein;
    MealVegetable newVegetable;
    MealStarch newStarch;

    public MealFacade() {
        newProtein = new MealProtein();
        newVegetable = new MealVegetable();
        newStarch = new MealStarch();
    }

    public void assembleMeal(String protein, String vegetable, String starch) {

        System.out.println("\n\tMeal assembly process initiated. . . ");
        newProtein.setProtein(protein);
        newVegetable.setVegetable(vegetable);
        newStarch.setStarch(starch);
        System.out.println("\tMeal assembly process completed. . . \n");
    }
}
