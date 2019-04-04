package CH4Prototype;

public class Forest extends BaseLevel {

    public Forest(String name) {
        levelName = name;
    }

    @Override
    public BaseLevel clone() throws CloneNotSupportedException {
        return (Forest)super.clone();
    }
}