package CH5Bridge;

public abstract class User {

    // class variables
    private String name;
    private String userID;
    private int downloadCredits;

    // constructor
    public User(String name, String userID, int downloadCredits) {
        this.name = name;
        this.userID = userID;
        this.downloadCredits = downloadCredits;
    }

    // abstract method
    public abstract int computeCredits();


    // accessor methods
    public String getName() {
        return name;
    }

    public String getUserID() {
        return userID;
    }

    public int getDownloadCredits() {
        return downloadCredits;
    }

    // mutator methods
    public void setName(String name) {
        this.name = name;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setDownloadCredits(int downloadCredits) {
        this.downloadCredits = downloadCredits;
    }
}
