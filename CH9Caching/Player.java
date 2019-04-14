package CH9Caching;

public class Player {

    int playerJersey;
    int playerPoints;
    Player before;
    Player next;

    // constructor
    public Player(int jersey, int points) {
        this.playerJersey = jersey;
        this.playerPoints = points;
    }
}
