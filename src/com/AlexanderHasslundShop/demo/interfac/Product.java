package com.AlexanderHasslundShop.demo.interfac;

public interface Product {

    String name();
    double price();
    String size();

     default void printPrice() {
        System.out.println("Produkt: " + name() + " ||" +" pris: " + price() +" || "+ "per " + size());
    }
    public class InterfaceExtention{

        public void callProduct() {
            Milk milk = new Milk();
            Chocolate chocolate = new Chocolate();
            Bread bread = new Bread();

            System.out.println("Produkt: " + milk.name() + " ||" +" pris: " + milk.price() +" || "+ "per " + milk.size());
            System.out.println("Produkt: " + chocolate.name() + " ||" +" pris: " + chocolate.price() +" || "+ "per " + chocolate.size());
            System.out.println("Produkt: " + bread.name() + " ||" +" pris: " + bread.price() +" || "+ "per " + bread.size());
        }
    }
}

