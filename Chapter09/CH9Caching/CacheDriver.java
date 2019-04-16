package CH9Caching;

public class CacheDriver {

    public static void main(String[] args) {

        System.out.println("\nChapter 9 Caching System.");

        ExampleCache myCache = new ExampleCache(5);

        myCache.put(8, 33643); // K.Bryant
        myCache.put(14, 25192); // J.West
        myCache.put(22, 23149); // E.Baylor
        myCache.put(24, 33643); // K.Bryant
        myCache.put(32, 17707); // E.Johnson
        myCache.put(33, 24176); // K.Jabbar

        System.out.println("From Cache Driver: Jersey->  8\tPoints-> " + myCache.retrieve(8));
        System.out.println("From Cache Driver: Jersey-> 14\tPoints-> " + myCache.retrieve(14));
        System.out.println("From Cache Driver: Jersey-> 22\tPoints-> " + myCache.retrieve(22));
        System.out.println("From Cache Driver: Jersey-> 24\tPoints-> " + myCache.retrieve(24));
        System.out.println("From Cache Driver: Jersey-> 32\tPoints-> " + myCache.retrieve(32));
        System.out.println("From Cache Driver: Jersey-> 33\tPoints-> " + myCache.retrieve(33));
    }
}
