package CH3Mediator;

public class AssemblySystem {

    public enum SystemSpeed {ZERO, ONE, TWO, THREE, FOUR, FIVE,
        SIX, SEVEN, EIGHT, NINE, TEN};

    private WidgetProductionSystem mediator;
    private boolean enabled;
    private SystemSpeed currentSpeed;

    // constructor
    public AssemblySystem(WidgetProductionSystem mediator) {
        this.mediator = mediator;
        enabled = false;
        currentSpeed = SystemSpeed.ZERO;
        mediator.mediateAssemblySystem(this);
    }

    // accessor
    public SystemSpeed getSystemSpeed() {
        return currentSpeed;
    }

    // mutator
    public void setSystemSpeed(SystemSpeed speed) {
        if ((isEnabled()) && (getSystemSpeed() != speed)) {
            currentSpeed = speed;
            mediator.assemblySystemSpeedChanged();
            System.out.println("Mediated Event: System Speed Changed to " + currentSpeed + ".");
        }
    }

    // additional methods
    public void enable() {
        enabled = true;
        mediator.assemblySystemEnabled();
        System.out.println("Mediated Event: System Initialized.");
    }

    public void disable() {
        enabled = false;
        mediator.assemblySystemDisabled();
        System.out.println("Mediated Event: System Deinitialized.");
    }

    public boolean isEnabled() {
        return enabled;
    }
}
