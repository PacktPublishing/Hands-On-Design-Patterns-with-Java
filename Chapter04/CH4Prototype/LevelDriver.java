package CH4Prototype;

public class LevelDriver {

    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println("\n\nGAME LEVEL CREATION\n");

        // Create Dungeon Game Level
        BaseLevel dungeon = new Dungeon("Slasher\'s Dungeon Level 1");
        dungeon.numberOfNPCs = 500;
        dungeon.numberOfTokens = 80;

        // Create Forest Game Level
        BaseLevel forest = new Forest("Acid Rain Forest Level");
        forest.numberOfNPCs = 250;
        forest.numberOfTokens = 120;

        // Create City Game Level
        BaseLevel city = new City("Industrial City Level");
        city.numberOfNPCs = 319;
        city.numberOfTokens = 600;

        // Clone Dungeon Object
        BaseLevel levelClone1;
        levelClone1 = dungeon.clone();
        levelClone1.setLevelName("Slasher\'s Dungeon Level 2");
        levelClone1.setNumberOfNPCs(1000);
        levelClone1.setNumberOfTokens(40);

        // Display output for functionality verification
        System.out.println("Dungeon Level information");
        System.out.println("Level Name      : " + dungeon.getLevelName());
        System.out.println("Number of NPCS  : " + dungeon.getNumberOfNPCs());
        System.out.println("Number of Tokens: " + dungeon.getNumberOfTokens());

        System.out.println("\nCloned Level information");
        System.out.println("Level Name      : " + levelClone1.getLevelName());
        System.out.println("Number of NPCS  : " + levelClone1.getNumberOfNPCs());
        System.out.println("Number of Tokens: " + levelClone1.getNumberOfTokens());
    }
}