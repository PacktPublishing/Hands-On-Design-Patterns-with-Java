package CH3Observer;

public class StudentDashboard extends Observable {

    private int unreadMessages;

    // constructor
    public StudentDashboard() {
        unreadMessages = 0;
    }

    public void setUnreadMessages(int messages) {
        unreadMessages = messages;

        /*
            Add methods here to notify observers of a change
         */

    }

    public int getUnreadMessages() {
        return unreadMessages;
    }
}
