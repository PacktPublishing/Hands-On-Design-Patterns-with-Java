package CH9Stateless;

public class Corgi implements CorgiState {

    // class variables
    private CorgiState corgiAwake;
    private CorgiState corgiEat;
    private CorgiState corgiPlay;
    private CorgiState corgiSleep;
    private CorgiState corgiSit;
    private CorgiState state;

    // constructor
    public Corgi(){
        this.corgiAwake = new CorgiAwake(this);
        this.corgiEat = new CorgiEat(this);
        this.corgiPlay = new CorgiPlay(this);
        this.corgiSleep = new CorgiSleep(this);
        this.corgiSit = new CorgiSit(this);

        this.state = corgiAwake;
    }

    // overriding interface methods
    @Override
    public void awake() {
        state.awake();
        setState(getCorgiSit());
    }

    @Override
    public void walk() {
        state.walk();
        setState(getCorgiSit());
    }

    @Override
    public void eat() {
        state.eat();
        setState(getCorgiSit());
    }

    @Override
    public void play() {
        state.play();
        setState(getCorgiSit());
    }

    @Override
    public void sit() {
        state.sit();
        setState(getCorgiSit());
    }

    @Override
    public void sleep() {
        state.sleep();
    }

    // accessor methods
    public CorgiState getCorgiAwake() {
        return corgiAwake;
    }

    public CorgiState getCorgiEat() {
        return corgiEat;
    }

    public CorgiState getCorgiPlay() {
        return corgiPlay;
    }

    public CorgiState getCorgiSleep() {
        return corgiSleep;
    }

    public CorgiState getState() {
        return state;
    }

    public CorgiState getCorgiSit() {
        return corgiSit;
    }

    // mutator methods
    public void setCorgiState(CorgiState state){
        this.state = state;
    }

    public void setCorgiAwake(CorgiState corgiAwake) {
        this.corgiAwake = corgiAwake;
    }

    public void setCorgiEat(CorgiState corgiEat) {
        this.corgiEat = corgiEat;
    }

    public void setCorgiPlay(CorgiState corgiPlay) {
        this.corgiPlay = corgiPlay;
    }

    public void setCorgiSleep(CorgiState corgiSleep) {
        this.corgiSleep = corgiSleep;
    }

    public void setState(CorgiState state) {
        this.state = state;
    }

    public void setCorgiSit(CorgiState corgiSit) {
        this.corgiSit = corgiSit;
    }

}