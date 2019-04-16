package CH9AsynchronousCommunication;

public class CallerTwo {

    // create callbackListener object
    private CallbackListener callbackListener;

    // setting up the callbacklistener
    public void registerCallbackListener(CallbackListener callbackListener)
    {
        this.callbackListener = callbackListener;
    }

    // asynchronous operation for CallerTwo
    public void processCallback()
    {
        // a new thread for the asynchronous operations using lambda
        new Thread(() -> {
            // simulated processing
            System.out.println("\nAsynchronous operations taking place . . .");
            System.out.println("\tSimulated processing from Caller Two. . . ");

            // check if callbackListener exists
            if (callbackListener != null) {

                // use processCallback() method of CallerOne
                callbackListener.processCallback();
            }
        }).start();
    }

    public static void main(String[] args)
    {
        CallerTwo asynchronousMessage = new CallerTwo(); // line 1

        CallbackListener callbackListener = new CallerOne(); // line 2

        asynchronousMessage.registerCallbackListener(callbackListener); // line 3

        asynchronousMessage.processCallback(); // line 4
    }
}
