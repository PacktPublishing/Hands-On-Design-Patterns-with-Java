package CH3Observer;

public class ForumMonitor implements Observer {

    public static final int UNREAD_ALERT_LEVEL = 0;

    public void update(Observable observable, Object object) {
        StudentDashboard messages = (StudentDashboard) observable;
        if (messages.getUnreadMessages() > UNREAD_ALERT_LEVEL) {
            System.out.println("You have " + messages.getUnreadMessages() + " unread messages.");
        } else {
            System.out.println("No unread messages found.");
        }
    }
}
