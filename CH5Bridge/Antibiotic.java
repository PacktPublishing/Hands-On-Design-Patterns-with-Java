package CH5Bridge;

public class Antibiotic implements Medicine {
    @Override
    public void administerMedication(int amount) {
        System.out.print(amount + " antibiotic pills administered.");
    }
}
