package CH4Builder;

public class PersonalRoaster implements Builder {

    private Roaster roaster = new Roaster();

    @Override
    public void buildCoolingTray() {
        roaster.add("Personal Roaster Cooling Tray added");
    }

    @Override
    public void buildExhaustSystem() {
        roaster.add("Personal Roaster Exhaust System added");
    }

    @Override
    public void buildGasBurner() {
        roaster.add("Personal Roaster Gas Burner added");
    }

    @Override
    public void buildPlatform() {
        // do nothing - not applicable for personal roasters
    }

    @Override
    public void buildMotor() {
        roaster.add("Standard Motor added");
    }

    @Override
    public void buildThermocouples() {
        roaster.add("Standard Thermocouples added");
    }

    @Override
    public void buildInnerDrum() {
        roaster.add("Personal Roaster Inner Drum added");
    }

    @Override
    public void buildMainBody() {
        roaster.add("Personal Roaster Main body added");
    }

    @Override
    public Roaster getRoaster() {
        return roaster;
    }
}
