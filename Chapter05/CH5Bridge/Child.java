package CH5Bridge;

public class Child extends Patient {

    public Child(Medicine med) {
        super(med);
    }

    @Override
    void selectPatient(int dose) {
        System.out.print("\tDoctor\'s Order: ");
        medicine.administerMedication(dose);

    }

    @Override
    void modifyMedication(int dose, int increment) {

        String message = "";

        if (increment < 0) {
            dose = dose - Math.abs(increment);
            message = "minus ";
        } else {
            dose = dose + increment;
            message = "plus ";
        }

        System.out.println("\n\tDoctor-ordered dosage change: " +
                message + Math.abs(increment) + " pills.");
        selectPatient(dose);
    }
}
