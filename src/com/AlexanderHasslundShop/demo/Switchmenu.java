package com.AlexanderHasslundShop.demo;

import com.AlexanderHasslund.demo.Input;
import com.AlexanderHasslundShop.demo.Products;

import java.util.MissingFormatWidthException;

public class Switchmenu {


    public void switchMenu() {
        Products products = new Products("", 0);
        Input input = new Input();
        boolean isStillShopping = true;

        do {
            System.out.println("switch");
            int inputChoice = input.intInput();
            try {
                switch (inputChoice) {
                    case 1:
                        products.addProducts();
                        break;
                    case 2:
                        // remove item
                        break;
                    case 3:
                        products.displayProducts();
                        break;
                    case 4:
                        // show prices
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
