package CH3NullObject;

public class SouthernTrain implements TrainStatus {

    private boolean activated;

    public void activate() {
        activated = true;
        System.out.println("Train Status Update: Southern Train Activated.");
    }

    public void deactivate() {
        activated = false;
        System.out.println("Train Status Update: Southern Train Deactivated.");
    }

    public boolean isActivated() {
        return activated;
    }
}