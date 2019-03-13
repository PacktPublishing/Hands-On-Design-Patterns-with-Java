package CH3Interpreter;

public class MapIntToCharacters implements Expression {

    // class variable
    private String tString;

    // constructor
    public MapIntToCharacters(String tString) {
        this.tString = tString;
    }

    @Override
    public void interpret(Conversion orignalContent) {
        orignalContent.convertToCharacters(tString);
    }
}
