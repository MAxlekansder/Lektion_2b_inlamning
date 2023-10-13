package com.AlexanderHasslundShop.demo;
import com.AlexanderHasslund.demo.Input;
import com.AlexanderHasslundShop.demo.interfac.Product;

import java.util.MissingFormatWidthException;

public class Switchmenu {



    public void switchMenu() {
        Products products = new Products("", 0);
        Product.InterfaceExtention interfaceExtention = new Product.InterfaceExtention();

        System.out.println("\nCase 1: lägg till inköpslista");
        System.out.println("Case 2: ta bort från inklista");
        System.out.println("Case 3: visa produkter i inklis");
        System.out.println("case 4: visa priser för produkt");
        System.out.println("case 5: stäng av programmet\n");

        Input input = new Input();
        boolean isStillShopping = true;


        do {
            try {
            System.out.println("switch");
            int inputChoice = input.intInput();

                switch (inputChoice) {
                    case 1:
                        products.addProducts();
                        break;
                    case 2:
                        products.removeProducts();
                        // remove item
                        break;
                    case 3:
                        products.displayProducts();
                        break;
                    case 4:
                        interfaceExtention.callProduct();
                        // show prices
                        break;
                    case 5:
                        // close app
                        isStillShopping = false;
                        break;
                }
            } catch (MissingFormatWidthException e) {
                System.out.println("Använd dig av heltal för att navigera!");
            }
        } while (isStillShopping);
    }
}
