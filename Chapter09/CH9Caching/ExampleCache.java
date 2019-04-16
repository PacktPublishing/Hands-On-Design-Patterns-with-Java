package CH9Caching;

import java.util.HashMap;

public class ExampleCache {

    // class variables
    private HashMap<Integer, Player> map;
    private int cacheCapacity;
    private int cacheCount;
    private Player playerHead;
    private Player playerTail;

    // constructor
    public ExampleCache(int cCapacity) {
        this.cacheCapacity = cCapacity;

        map = new HashMap<>();
        playerHead = new Player(0,0);
        playerTail = new Player(0,0);
        playerHead.next = playerTail;
        playerTail.before = playerHead;
        playerHead.before = null;
        playerTail.next = null;
        cacheCount = 0;
    }

    public void addToPlayerHead(Player player) {
        player.next = playerHead.next;
        player.next.before = player;
        player.before = playerHead;
        playerHead.next = player;
    }

    public void deletePlayer(Player player) {
        player.before.next = player.next;
        player.next.before = player.before;
    }

    public int retrieve(int playerJersey) {
        if (map.get(playerJersey) != null) {
            Player player = map.get(playerJersey);
            int result = player.playerPoints;
            deletePlayer(player);
            addToPlayerHead(player);
            System.out.println("\t\t\t\t\t\t\t\t\tRETRIEVED: jersey -> " + playerJersey +
                    "\tPoints-> " + result);
            return result;
        }
        System.out.println("\t\t\t\t\t\t\t\t\tRETRIEVED: jersey-> " + playerJersey +
                        "\tPoints-> " + " no value");
        return -1;
    }

    public void put(int jersey, int points) {
        System.out.println("SETTING: " + jersey + " (jersey) & " +
                points + " (points)");
        if (map.get(jersey) != null) {
            Player player = map.get(jersey);
            player.playerPoints = points;
            deletePlayer(player);
            addToPlayerHead(player);
        } else {
            Player player = new Player(jersey, points);
            map.put(jersey, player);
            if (cacheCount < cacheCapacity) {
                cacheCount++;
                addToPlayerHead(player);
            } else {
                map.remove(playerTail.before.playerJersey);
                deletePlayer(playerTail.before);
                addToPlayerHead(player);
            }
        }
    }
}
