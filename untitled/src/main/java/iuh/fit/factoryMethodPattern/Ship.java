package iuh.fit.factoryMethodPattern;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Ship delivers goods by sea.");
    }
}
