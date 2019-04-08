package CH8Stream;

import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        System.out.println();

        Stream.iterate(0, x->x+3)
                .peek(number -> System.out.print("\nPeeked at: "))
                .limit(7)
                .forEach(System.out::println);
    }
}
