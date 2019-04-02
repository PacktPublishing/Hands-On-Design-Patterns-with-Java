package CH5Proxy.ProxyClasses;

public class ProxyDriver {

    public static void main(String[] args)  {

        System.out.println("\n\n======================================================");
        System.out.println("\t\t\tProxy Weather Forecast Demo");
        System.out.println("======================================================");

        Proxy proxyCall = new Proxy();
        proxyCall.whoAmI();
    }
}