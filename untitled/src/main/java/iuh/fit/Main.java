package iuh.fit;

import iuh.fit.factoryMethodPattern.FactoryMethodDemo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FactoryMethodDemo demo = new FactoryMethodDemo();

        System.out.println("=== Factory Method Pattern ===");
        demo.run("road");
        demo.run("sea");
    }
}