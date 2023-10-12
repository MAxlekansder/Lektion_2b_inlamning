package com.AlexanderHasslundShop.demo;

import com.AlexanderHasslund.demo.Input;
import com.AlexanderHasslundShop.demo.Products;

public class Switchmenu {

    Products products;


    public void switchMenu() {
        this.products = products;
        Input input = new Input();

        int inputChoice = input.intInput();
        boolean isStillShopping = true;

        do {
            switch (inputChoice) {
                case 1:
                    products.addProducts();
                    break;
                case 2:
                    // remove item
                    break;
                case 3:
                    // show products
                    break;
                case 4:
                    // show prices
                case 5:
                    // close app
                    isStillShopping = false;
                    break;
            }
        } while (isStillShopping);
    }
}
