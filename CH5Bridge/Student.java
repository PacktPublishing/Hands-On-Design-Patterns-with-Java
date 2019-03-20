package CH5Bridge;

public class Student extends User {

    private int gradeLevel;

    public Student(String name, String userID, int downloadCredits, int gradeLevel) {
        super(name, userID, downloadCredits);
        this.gradeLevel = gradeLevel;
    }

    @Override
    public int computeCredits() {
        return getDownloadCredits() * gradeLevel;
    }
}
