package CH3Memento;

public class GameMission {

    // class variables
    private int percentageCompleted;
    int previousPercentageCompleted;

    // constructor
    public GameMission() {
        percentageCompleted = 0;
        previousPercentageCompleted = 0;
    }

    // mutator
    public void setPercentageCompeted(int percentage) {
        previousPercentageCompleted = percentageCompleted;
        percentageCompleted = percentage;
    }

    // accessor
    public int getPercentageCompleted() {
        return percentageCompleted;
    }
}
