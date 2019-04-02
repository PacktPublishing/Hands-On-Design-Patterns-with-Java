package CH3NullObject;

public class NorthernTrain implements TrainStatus {

    private boolean activated;

    public void activate() {
        activated = true;
        System.out.println("Train Status Update: Northern Train Activated.");
    }

    public void deactivate() {
        activated = false;
        System.out.println("Train Status Update: Northern Train Deactivated.");
    }

    public boolean isActivated() {
        return activated;
    }
}
