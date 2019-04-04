package CH4Prototype;

public abstract class BaseLevel implements Cloneable {

    public String levelName;
    public int numberOfNPCs;
    public int numberOfTokens;

    // accessor methods
    public String getLevelName() {
        return levelName;
    }

    public int getNumberOfNPCs() {
        return numberOfNPCs;
    }

    public int getNumberOfTokens() {
        return numberOfTokens;
    }

    // mutator methods
    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public void setNumberOfNPCs(int npc) {
        this.numberOfNPCs = npc;
    }

    public void setNumberOfTokens(int tokens) {
        this.numberOfTokens = tokens;

    }

    // level clone method
    public BaseLevel clone() throws CloneNotSupportedException {
        return (BaseLevel)super.clone();
    }
}
