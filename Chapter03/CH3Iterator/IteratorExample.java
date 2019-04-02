package CH3Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {

        ArrayList<String> colonies = new ArrayList<>();

        colonies.add("Aerlion");
        colonies.add("Aquaria");
        colonies.add("Canceron");
        colonies.add("Caprica");
        colonies.add("Gemenon");
        colonies.add("Leonis");
        colonies.add("Libran");
        colonies.add("Picon");
        colonies.add("Sagittaron");
        colonies.add("Scorpia");
        colonies.add("Tauron");
        colonies.add("Virgon");

        // instantiate iterator
        Iterator myIterator = colonies.iterator();

        // console output
        System.out.println("\n\nOriginal Colonies of Kobol:");

        // iterate through the list
        while (myIterator.hasNext())
            System.out.println("\t\t" + myIterator.next());

    }
}
