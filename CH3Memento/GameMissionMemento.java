package CH3Memento;

public class GameMissionMemento {

    // class variables
    private GameMission gameMission;
    private int copyOfCurrentCompletionProgress;
    private int copyOfPreviousCompletionProgress;

    // constructor
    public GameMissionMemento(GameMission gameMission) {
        this.gameMission = gameMission;
        copyOfCurrentCompletionProgress = gameMission.getPercentageCompleted();
        copyOfPreviousCompletionProgress = gameMission.previousPercentageCompleted;
    }

    public void resetMissionStatus() {
        gameMission.setPercentageCompeted(copyOfCurrentCompletionProgress);
        gameMission.previousPercentageCompleted = copyOfPreviousCompletionProgress;
    }
}
