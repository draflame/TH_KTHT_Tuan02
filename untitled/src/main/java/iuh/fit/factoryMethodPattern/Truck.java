package iuh.fit.factoryMethodPattern;

public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Truck delivers goods by road.");
    }
}
