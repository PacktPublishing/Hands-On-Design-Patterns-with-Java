package CH5Proxy.MasterClasses;

public class ConcreteWeather extends Weather {

    @Override
    public void whoAmI() {
        System.out.println("\tMethod Call from " +
                this.getClass().getSimpleName() + " class");
        System.out.println("\t\tWeather forcast is sunny\n");
    }
}
