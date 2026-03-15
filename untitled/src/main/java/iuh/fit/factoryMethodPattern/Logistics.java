package iuh.fit.factoryMethodPattern;

public abstract class Logistics {

    public void planDelivery() {
        Transport transport = createTransport();
        System.out.println("Planning delivery...");
        transport.deliver();
    }

    protected abstract Transport createTransport();
}
