package CH4Builder;

public class RoasterDirector {
    Builder currentBuilder;

    // roaster building steps
    public void buildRoaster(Builder builder) {

        currentBuilder = builder;
        currentBuilder.buildCoolingTray();
        currentBuilder.buildExhaustSystem();
        currentBuilder.buildGasBurner();
        currentBuilder.buildInnerDrum();
        currentBuilder.buildMainBody();
        currentBuilder.buildMotor();
        currentBuilder.buildPlatform();
        currentBuilder.buildThermocouples();
    }
}
