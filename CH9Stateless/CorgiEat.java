package CH9Stateless;

public class CorgiEat implements CorgiState{

    private final Corgi corgi;

    public CorgiEat(Corgi corgi){
        this.corgi = corgi;
    }

    @Override
    public void awake() {
        System.out.println("The Corgi is AWAKE.");
    }

    @Override
    public void walk() {
        System.out.println("The Corgi is WALKING.");
    }

    @Override
    public void sit() {
        System.out.println("The Corgi is SITTING.");
    }

    @Override
    public void eat() {
        System.out.println("The Corgi is EATING");
        corgi.setCorgiState(corgi.getCorgiSleep());
    }

    @Override
    public void play() {
        System.out.println("The Corgi is PLAYING");
    }

    @Override
    public void sleep() {
        System.out.println("The Corgi is SLEEPING.");
    }
}