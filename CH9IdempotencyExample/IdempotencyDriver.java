package CH9IdempotencyExample;

public class IdempotencyDriver {

    public static void main(String[] args) {

        System.out.println("\n = = = = = = = = = = = = = = = = = = = = = = ");
        System.out.println("\t\tHOSPITAL INFORMATION SYSTEM");
        System.out.println(" = = = = = = = = = = = = = = = = = = = = = = ");

        String tID = "XP330019";

        // Admission
        Patient patient = new Patient(tID);
        System.out.println("\nPatient " + patient.getPatientID() + " admitted.");
        patient.setLengthOfStay(1);
        System.out.println("\tLength of stay : " + patient.getLengthOfStay());

        // Lab Work
        System.out.println("\nPatient " + patient.getPatientID() + " received lab work.");
        patient.setLengthOfStay(1);
        System.out.println("\tLength of stay : " + patient.getLengthOfStay());

        // Next Day
        patient.setDayCounted(false);
        System.out.println("\nPatient " + patient.getPatientID() + " received surgery.");
        patient.setLengthOfStay(1);
        System.out.println("\tLength of stay : " + patient.getLengthOfStay());
    }

}
