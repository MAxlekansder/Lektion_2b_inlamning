package com.AlexanderHasslundShop.demo;

import com.AlexanderHasslund.demo.Input;


public class Main {

    public static void main(String[] args) {
        Input input = new Input();
        int inputChoice = input.intInput();
        boolean isStillShopping = true;


       do {
           switch (inputChoice) {
               case 1:

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
       }    while (isStillShopping) ;


    }
}
