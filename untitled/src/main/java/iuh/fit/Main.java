package iuh.fit;

import iuh.fit.logisticsFactoryPattern.Logistics;
import iuh.fit.logisticsFactoryPattern.RoadLogistics;
import iuh.fit.logisticsFactoryPattern.SeaLogistics;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Logistics logistics;
        String type="road";
        if (type.equalsIgnoreCase("road")){
            logistics= new RoadLogistics();
        }else {
            logistics= new SeaLogistics();
        }
        logistics.planDelivery();
    }
}