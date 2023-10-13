package com.AlexanderHasslundShop.demo.interfac;

public class Chocolate implements Product {

    @Override
    public String name() {
        return "Choklad";
    }

    @Override
    public double price() {
        return 23.54;
    }

    @Override
    public String size() {
        return 200  + " gram";
    }
}
