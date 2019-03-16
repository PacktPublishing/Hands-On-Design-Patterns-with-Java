package CH4AbstractFactory;

public class TypeCFactory extends MotorHomeAbstractFactory {


    public Frame createFrame() {
        return new TypeCFrame();
    }

    public Style createStyle() {
        return new TypeCStyle();
    }

    public Engine createEngine() {
        return new TypeCEngine();
    }

    public Kitchen createKitchen() {
        return new TypeCKitchen();
    }
}