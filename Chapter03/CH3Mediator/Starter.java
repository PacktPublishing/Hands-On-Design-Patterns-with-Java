package CH3Mediator;

public class Starter {

    private WidgetProductionSystem mediator;
    private boolean poweredOn;

    // Constructor
    public Starter(WidgetProductionSystem mediator) {
        this.mediator = mediator;
        poweredOn = false;

        mediator.mediateStarter(this);
    }

    // accessor
    public boolean isSystemOn() {
        return poweredOn;
    }

    public void turnOn() {
        poweredOn = true;
        mediator.starterPoweredOn();
        System.out.println("Mediated Event: Started Powered On");
    }

    public void turnOff() {
        poweredOn = false;
        mediator.starterPoweredOff();
        System.out.println("Mediated Event: Starter Powered Off");
    }
}
