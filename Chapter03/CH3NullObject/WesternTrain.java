package CH3NullObject;

public class WesternTrain implements TrainStatus {

    private boolean activated;

    public void activate() {
        activated = true;
        System.out.println("Train Status Update: Western Train Activated.");
    }

    public void deactivate() {
        activated = false;
        System.out.println("Train Status Update: Western Train Deactivated.");
    }

    public boolean isActivated() {
        return activated;
    }
}