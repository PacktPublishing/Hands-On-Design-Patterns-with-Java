package CH9AsynchronousCommunication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class CallerOne implements CallbackListener {

    @Override
    public void processCallback()
    {
        System.out.println("\nAsynchronous Task Completed Followed by Callback.");

        System.out.println("\tSimulated processing from Caller One . . . ");
        doSomething1(34, 12);

        System.out.println("\tSimulated processing from Caller Two . . . ");
        doSomething2("nrettaP ngiseD noitacinummoC suonorhcnysA");
        System.out.println();
    }

    public void doSomething1(int x, int y) {

        // determine and output max value
        System.out.println("\t\tThe largest number is " + Math.max(x, y));
    }

    public void doSomething2(String backwardsPhrase) {

        // reverse a string
        char[] phrase = backwardsPhrase.toCharArray();
        List<Character> newPhrase = new ArrayList<>();

        for (char character: phrase)
            newPhrase.add(character);

        Collections.reverse(newPhrase);
        ListIterator myInterator = newPhrase.listIterator();

        System.out.print("\t\tResultant Phrase: ");
        while (myInterator.hasNext())
            System.out.print(myInterator.next());
    }
}

