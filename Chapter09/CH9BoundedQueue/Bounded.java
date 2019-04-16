package CH9BoundedQueue;

import java.util.concurrent.BlockingQueue;

public class Bounded extends Thread {

    private BlockingQueue<Integer> inputValue;

    Bounded(BlockingQueue<Integer> blockingQueue) {
        this.inputValue = blockingQueue;
    }

    public void run() {
        try {
            while (true) {
                Integer myInteger = inputValue.take();

                if (myInteger == null) {
                    break;
                }
                System.out.println(myInteger + " squared is " +
                        (myInteger * myInteger));
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted Exception Encountered.");
        }
    }
}
