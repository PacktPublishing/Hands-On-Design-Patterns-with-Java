package CH9FailFast;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastImplementation {

    public static void main(String[] args) throws ConcurrentModificationException {

        System.out.println();

        Map<String, String> firstLast = new HashMap<String, String>();
        firstLast.put("Kay", "Brentwood");
        firstLast.put("Daisy", "Jinsen");
        firstLast.put("Frank", "Corsack");
        firstLast.put("Hugo", "Trapleton");

        Iterator iterator = firstLast.keySet().iterator();

        while (iterator.hasNext()) {

            try {
                System.out.println(firstLast.get(iterator.next()));
            } catch (ConcurrentModificationException e) {
                System.out.println("Encountered Exception: Failing Fast!");
                return;
            }
        }
    }
}
