package CH3Mediator;

public class WidgetProductionSystem {

    // class variables
    private Starter starter;
    private AssemblySystem assemblySystem;
    private SystemAccelerator systemAccelerator;
    private EmergencyBreak emergencyBreak;
    private Hopper hopper;

    private int currentSpeed;

    // constructor
    public WidgetProductionSystem() {
        currentSpeed = 0;
    }

    // mediation methods
    public void mediateStarter(Starter starter) {
        this.starter = starter;
    }

    public void mediateAssemblySystem(AssemblySystem assemblySystem) {
        this.assemblySystem = assemblySystem;
    }

    public void mediateSystemAcceleration(SystemAccelerator systemAccelerator) {
        this.systemAccelerator = systemAccelerator;
    }

    public void mediateEmergencyBreak(EmergencyBreak emergencyBreak) {
        this.emergencyBreak = emergencyBreak;
    }

    public void mediateHopper(Hopper hopper) { this.hopper = hopper; }

    // object interaction methods
    public void starterPoweredOn() {
        assemblySystem.enable();
        hopper.enable();
        systemAccelerator.enable();
        emergencyBreak.enable();
    }

    public void starterPoweredOff() {
        assemblySystem.disable();
        hopper.disable();
        systemAccelerator.disable();
        emergencyBreak.disable();
    }

    public void assemblySystemEnabled() {
        System.out.println("Mediation Decision: Hopper Enabled.");
    }

    public void assemblySystemDisabled() {
        System.out.println("Mediation Decision: Hopper Disabled.");
    }

    public void hopperEnabled() {
        System.out.println("Mediation Decision: Assembly System Enabled.");
    }

    public void hopperDisabled() {
        System.out.println("Mediation Decision: Assembly System Disabled.");
    }

    public void assemblySystemSpeedChanged() {
        System.out.println("Mediation Decision: Permissible Speed Change.");
    }

    public void systemAcceleratorEnabled() {
        System.out.println("Mediation Decision: Emergency Break Enabled");
    }

    public void systemAcceleratorDisabled() {
        System.out.println("Mediation Decision: Emergency Break Disabled");
    }

    public void systemAcceleratorUsed() {
        emergencyBreak.disable();
        while (currentSpeed < systemAccelerator.getAcceleratorSpeed()) {
            currentSpeed ++;
            System.out.println("Mediation Event: Speed Changed to " + currentSpeed + ".");

            if (currentSpeed <= 10) {
                assemblySystem.setSystemSpeed(AssemblySystem.SystemSpeed.ONE);
            } else if (currentSpeed <= 20) {
                assemblySystem.setSystemSpeed(AssemblySystem.SystemSpeed.TWO);
            } else if (currentSpeed <= 30) {
                assemblySystem.setSystemSpeed(AssemblySystem.SystemSpeed.THREE);
            } else if (currentSpeed <= 40) {
                assemblySystem.setSystemSpeed(AssemblySystem.SystemSpeed.FOUR);
            } else if (currentSpeed <= 50) {
                assemblySystem.setSystemSpeed(AssemblySystem.SystemSpeed.FIVE);
            } else if (currentSpeed <= 60) {
                assemblySystem.setSystemSpeed(AssemblySystem.SystemSpeed.SIX);
            } else if (currentSpeed <= 70) {
                assemblySystem.setSystemSpeed(AssemblySystem.SystemSpeed.SEVEN);
            } else if (currentSpeed <= 80) {
                assemblySystem.setSystemSpeed(AssemblySystem.SystemSpeed.EIGHT);
            } else if (currentSpeed <= 90) {
                assemblySystem.setSystemSpeed(AssemblySystem.SystemSpeed.NINE);
            } else { assemblySystem.setSystemSpeed(AssemblySystem.SystemSpeed.TEN); }
        }
        emergencyBreak.enable();
    }

    public void setEmergencyBreakEnabled() {
        System.out.println("Mediation Decision: System Accelerator Disabled.");
    }

    public void setEmergencyBreakDisabled() {
        System.out.println("Mediation Decision: System Accelerator Enabled.");
    }

    public void setEmergencyBreakEngaged() {
        systemAccelerator.disable();
        currentSpeed = 0;
    }

    public void setEmergencyBreakDisengaged() {
        assemblySystem.setSystemSpeed(AssemblySystem.SystemSpeed.ZERO);
        currentSpeed = 0;
    }
}
