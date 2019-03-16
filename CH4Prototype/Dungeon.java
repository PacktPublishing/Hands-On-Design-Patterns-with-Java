package CH4Prototype;

public class Dungeon extends BaseLevel {

    public Dungeon(String name) {
        levelName = name;
    }

    @Override
    public BaseLevel clone() throws CloneNotSupportedException {
        return (Dungeon)super.clone();
    }
}
