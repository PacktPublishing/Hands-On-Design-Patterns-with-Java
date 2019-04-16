package CH9Stateless;

public class CorgiSleep implements CorgiState{

    private final Corgi corgi;

    public CorgiSleep(Corgi corgi){
        this.corgi = corgi;
    }

    @Override
    public void awake() {
        System.out.println("The Corgi is AWAKE.");
    }

    @Override
    public void walk() {
        System.out.println("The Corgi cannot WALK when it is SLEEPING.");
    }

    @Override
    public void sit() {
        System.out.println("The Corgi is SITTING.");
    }

    @Override
    public void eat() {
        System.out.println("The Corgi cannot EAT when it is SLEEPING.");
        corgi.setCorgiState(corgi.getCorgiSleep());
    }

    @Override
    public void play() {
        System.out.println("The Corgi cannot PLAY when it is SLEEPING.");
    }

    @Override
    public void sleep() {
        System.out.println("The Corgi is SLEEPING.");
    }
}