package CH9FailureHandling;

public class ControlledFailure {

    static int checkStatus(String component, int port){

        System.out.println("\n\tChecking status of : " + component);
        // artifical introduction of divide by zero error
        int result = (port / 0);

        return result;
    }

    static int processServiceOrder(String process, int serviceOrderNbr) {

        int gatewayStatus = 0;

        try
        {
            gatewayStatus = checkStatus(process, serviceOrderNbr);
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Error detected: " + ex.getMessage());
        }
        return gatewayStatus;
    }

    public static void main(String args[]){

        String processToCheck = "Payment Gateway";
        int serviceOrderNumber = 319;

        try
        {
            System.out.println("\nService order processing . . . ");
            int serviceOrder = processServiceOrder(processToCheck, serviceOrderNumber);

        }
        catch(ArithmeticException ex)
        {
            System.out.println("\n\tPayment Gateway is offline. Your orders " +
                    "\n\twill be automatically processed via batch "+
                    "\n\twhen the gateway is back online.");

            System.out.println("\n. . . continue processing service order.");
        }
    }
}
