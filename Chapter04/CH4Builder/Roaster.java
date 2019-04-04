package CH4Builder;

import java.util.LinkedList;

public class Roaster {

    private LinkedList<String> components;

    public Roaster() {
        components = new LinkedList<>();
    }

    public void add(String component) {
        components.addLast(component);
    }

    public void display() {
        System.out.println("\n\nROASTER BUILD:");
        for (int i=0; i<components.size(); i++) {
            System.out.println(components.get(i));
        }
    }
}
