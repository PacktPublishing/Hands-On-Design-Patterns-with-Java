package CH9Stateless;

public class CorgiAwake implements CorgiState{

    private final Corgi corgi;

    public CorgiAwake(Corgi corgi){
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
    public void eat() {
        System.out.println("The Corgi is EATING.");
        corgi.setCorgiState(corgi.getCorgiEat());
    }

    @Override
    public void play() {
        System.out.println("The Corgi is PLAYING.");
        corgi.setCorgiState(corgi.getCorgiPlay());
    }

    @Override
    public void sit() {
        System.out.println("The Corgi is SITTING.");
    }

    @Override
    public void sleep() {
        corgi.setState(corgi.getCorgiSleep());
        System.out.println("The Corgi is SLEEPING.");
    }
}