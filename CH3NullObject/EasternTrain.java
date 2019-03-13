package CH3NullObject;

public class EasternTrain implements TrainStatus {

    private boolean activated;

    public void activate() {
        activated = true;
        System.out.println("Train Status Update: Eastern Train Activated.");
    }

    public void deactivate() {
        activated = false;
        System.out.println("Train Status Update: Eastern Train Deactivated.");
    }

    public boolean isActivated() {
        return activated;
    }
}