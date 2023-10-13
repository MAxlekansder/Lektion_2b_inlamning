package com.AlexanderHasslundShop.demo.interfac;

public class Bread implements Product {
    @Override
    public String name() {
        return "Formfranska";
    }

    @Override
    public double price() {
        return 32.40;
    }

    @Override
    public String size() {
        return 1 + "per styck";
    }
}
