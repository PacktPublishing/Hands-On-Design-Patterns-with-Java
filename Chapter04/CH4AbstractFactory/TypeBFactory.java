package CH4AbstractFactory;

public class TypeBFactory extends MotorHomeAbstractFactory {


    public Frame createFrame() {
        return new TypeBFrame();
    }

    public Style createStyle() {
        return new TypeBStyle();
    }

    public Engine createEngine() {
        return new TypeBEngine();
    }

    public Kitchen createKitchen() {
        return new TypeBKitchen();
    }
}