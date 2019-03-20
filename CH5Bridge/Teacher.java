package CH5Bridge;

public class Teacher extends User {

    private int teachingStatus;

    public Teacher(String name, String userID, int downloadCredits, int teachingStatus) {
        super(name, userID, downloadCredits);
        this.teachingStatus = teachingStatus;
    }

    @Override
    public int computeCredits() {
        return getDownloadCredits() * teachingStatus;
    }
}
