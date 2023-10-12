package com.AlexanderHasslundShop.demo;

import com.AlexanderHasslund.demo.Input;

import java.util.ArrayList;
import java.util.List;

public class Products {

    List<Products> productsList = new ArrayList<>();
    private String productName = "";
    private int productCount;
    boolean prodListTrue = false;


    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Products(String productName, int productCount) {
        this.productName = productName;
        this.productCount = productCount;
    }


    public void addProducts() {
        boolean isDone = true;
        do {

            System.out.print("Vad för produkt vill du lägga till?: Annars skriv 'Klar' ");
            setProductName(Input.stringInput());
            if (!(getProductName().toLowerCase().equals("klar") && !getProductName().isEmpty())) {

                //setProductName(getProductName());
                System.out.print("Hur många?: ");
                setProductCount(Input.intInput());
                productsList.add(new Products(getProductName(), getProductCount()));
                prodListTrue = true;
            } else {
                isDone = false;
                break;

            }
        } while (isDone);
    }

    public void removeProducts() {
        if (prodListTrue) {
            System.out.println("Vill du ta bort något?: J/N");
            String checkDelete = Input.stringInput();

            if (checkDelete.toLowerCase().equals("j")) {
                System.out.println("Vad skulle du vilja ta bort? ");


                for (int i = 0; i < productsList.size(); i++) {
                    int deletedRow = (i + 1);
                    System.out.println(productsList.get(i) + " VÄLJ NUMMER FÖR ATT RADERA: " + deletedRow);
                }
                int deleteProduct = Input.intInput();
                System.out.println("Du valde att ta bort: " + productsList.get(deleteProduct -1 ).getProductName());
                productsList.remove(deleteProduct - 1);


                System.out.println("\nnu finns endast detta kvar på listan:");
                displayProducts();
            }
        } else {
            System.out.println("Lägg till något först!");
        }

    }

    public void displayProducts() {
        System.out.println("--INKÖPSLISTA--");
        for (int i = 0; i < productsList.size(); i++) {
            System.out.println(productsList.get(i));
        }
    }

    @Override
    public String toString() {
        return
                "Produkt: " + productName + " -  " + "Antal: " + productCount + " ||";
    }
}
