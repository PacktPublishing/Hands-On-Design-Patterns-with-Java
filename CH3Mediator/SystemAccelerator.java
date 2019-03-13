package CH3Mediator;

public class SystemAccelerator {

    // class variables
    private WidgetProductionSystem mediator;
    private boolean enabled;
    private int speed;

    // constructor
    public SystemAccelerator(WidgetProductionSystem mediator) {
        this.mediator = mediator;
        enabled = false;
        speed = 0;
        mediator.mediateSystemAcceleration(this);
    }

    // accessor
    public int getAcceleratorSpeed() {
        return speed;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void enable() {
        enabled = true;
        mediator.systemAcceleratorEnabled();
        System.out.println("Mediated Event: System Accelerator Enabled.");
    }

    public void disable() {
        enabled = false;
        mediator.systemAcceleratorDisabled();
        System.out.println("Mediated Event: System Accelerator Disabled.");
    }



    public void accelerateToSpeed(int speed) {
        if (isEnabled()) {
            this.speed = speed;
            mediator.systemAcceleratorUsed();
            System.out.println("Mediated Event: System Accelerator Set to " + speed + ".");
        }
    }
}
