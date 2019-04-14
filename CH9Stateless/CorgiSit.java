package CH9Stateless;

public class CorgiSit implements CorgiState{

    private final Corgi corgi;

    public CorgiSit(Corgi corgi){
        this.corgi = corgi;
    }

    @Override
    public void awake() {
        System.out.println("\tThe Corgi is now AWAKE.");
        corgi.setState(corgi.getCorgiAwake());
    }

    @Override
    public void walk() {
        System.out.println("The Corgi is SITTING and waiting for action...");
        corgi.setState(corgi.getCorgiAwake());
        System.out.println("\tThe Corgi is now WALKING");
    }

    @Override
    public void eat() {
        System.out.println("The Corgi is SITTING and waiting for action...");
        corgi.setCorgiState(corgi.getCorgiEat());
        System.out.println("\tThe Corgi is now EATING.");
    }

    @Override
    public void play() {
        System.out.println("The Corgi is SITTING and waiting for action...");
        corgi.setCorgiState(corgi.getCorgiPlay());
        System.out.println("\tThe Corgi is now PLAYING.");
    }

    @Override
    public void sit() {
        System.out.println("The Corgi is SITTING and waiting for action...");
    }

    @Override
    public void sleep() {
        System.out.println("Shhh; the Corgi is sleeping.");
        corgi.setState(corgi.getCorgiSleep());
        System.out.println("\tThe Corgi is now SLEEPING.");
    }
}