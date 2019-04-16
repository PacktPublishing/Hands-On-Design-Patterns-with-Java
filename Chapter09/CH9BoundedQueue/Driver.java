package CH9BoundedQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Driver {

    public static void main(String[] args) throws InterruptedException {

        int boundedSize = 10;

        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(boundedSize);

        int boundedThread = 2;

        Bounded[] bounded = new Bounded[boundedThread];

        System.out.println();

        for (int i=0; i < bounded.length; i++) {
            bounded[i] = new Bounded(blockingQueue);
            bounded[i].start();
        }

        for (int i=1; i < 11; i++) {
            blockingQueue.put(i);
        }
    }
}
