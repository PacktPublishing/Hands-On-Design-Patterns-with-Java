package CH5Bridge;

public class Administrator extends User {

    public Administrator(String name, String userID, int downloadCredits) {
        super(name, userID, downloadCredits);
    }

    @Override
    public int computeCredits() {
        return 0;
    }
}
