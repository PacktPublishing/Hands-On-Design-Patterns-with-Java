package CH3Mediator;

public class Hopper {

    private WidgetProductionSystem mediator;
    private boolean enabled;

    // constructor
    public Hopper(WidgetProductionSystem mediator) {
        this.mediator = mediator;
        enabled = false;
        mediator.mediateHopper(this);
    }

    // accessor
    public boolean getHopperEnabled() {
        return enabled;
    }

    public void enable() {
        enabled = true;
        mediator.hopperEnabled();
        System.out.println("Mediated Event: Hopper Initialized.");
    }

    public void disable() {
        enabled = false;
        mediator.hopperDisabled();
        System.out.println("Mediated Event: Hopper Deinitialized.");
    }
}
