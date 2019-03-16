package CH4Prototype;

public class City extends BaseLevel {

    public City(String name) {
        levelName = name;
    }

    @Override
    public BaseLevel clone() throws CloneNotSupportedException {
        return (City)super.clone();
    }
}