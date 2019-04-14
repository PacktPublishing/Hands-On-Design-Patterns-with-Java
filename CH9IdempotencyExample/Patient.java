package CH9IdempotencyExample;

public class Patient {

    String patientID;
    int lengthOfStay;
    boolean dayCounted;

    // constructor
    public Patient (String patientID) {
        this.patientID = patientID;
        this.lengthOfStay = 0;
        this.dayCounted = false;
    }

    // accessor methods
    public String getPatientID() {
        return this.patientID;
    }

    public int getLengthOfStay() {
        return this.lengthOfStay;
    }

    public boolean getDayCounted() {
        return this.dayCounted;
    }

    // mutator methods
    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public void setLengthOfStay(int lengthOfStay) {

        if (this.dayCounted) {
            System.out.println("\tIdempotency Implemented: Length of Stay already computed.");
        } else {
            this.lengthOfStay += lengthOfStay;
            this.dayCounted = true;
        }
    }

    public void setDayCounted(boolean counted) {
        this.dayCounted = counted;
    }
}
