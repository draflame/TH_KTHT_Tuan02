package iuh.fit.factoryMethodPattern;

public class FactoryMethodDemo {

    public void run(String type) {
        Logistics logistics = createLogistics(type);
        logistics.planDelivery();
    }

    private Logistics createLogistics(String type) {
        if ("sea".equalsIgnoreCase(type)) {
            return new SeaLogistics();
        }
        return new RoadLogistics();
    }
}
