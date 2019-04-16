package CH9Stateless;

public class StatelessDriver {

    public static void main(String[] args) {

        System.out.println("\n = = = = = = = = = = = = = = =");
        System.out.println("\tCORGI STATELESS SYSTEM");
        System.out.println(" = = = = = = = = = = = = = = =\n");

        Corgi corgi = new Corgi();

        corgi.awake();
        corgi.walk();
        corgi.play();
        corgi.eat();
        corgi.walk();
        corgi.sleep();

        corgi.play();
        corgi.sleep();
        corgi.eat();
    }
}