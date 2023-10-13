package com.AlexanderHasslundShop.demo.interfac;

public class Milk implements Product {

    @Override
    public String name() {
        return "Mjök";
    }

    @Override
    public double price() {
        return 18.90;
    }

    @Override
    public String size() {
        return 1 + " Liter";
    }


}
