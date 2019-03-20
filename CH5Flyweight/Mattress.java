package CH5Flyweight;

public class Mattress implements MattressInterface {

    // class variables
    String matrressSize;
    public String mattressFirmness;

    // constructor
    public Mattress(String matrressSize) {
        this.matrressSize = matrressSize;
    }

    // mutator
    public void setMattressFirmness(String mattressFirmness) {
        this.mattressFirmness = mattressFirmness;
    }

    @Override
    public void print() {
        System.out.println("\t\tThis is a " + mattressFirmness +
                " " + matrressSize + " mattress.");
    }
}
