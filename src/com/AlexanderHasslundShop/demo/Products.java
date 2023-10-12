package com.AlexanderHasslundShop.demo;

import com.AlexanderHasslund.demo.Input;

import java.util.ArrayList;
import java.util.List;

public class Products {

    List<Products> productsList = new ArrayList<>();
    private String productName = "";
    private int productCount;


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

        System.out.print("Vad för produkt vill du lägga till?: ");
        setProductName(Input.stringInput());
        System.out.print("Hur många?: ");
        setProductCount(Input.intInput());

        productsList.add( new Products(getProductName(), getProductCount()));
    }

    public void removeProducts(String productName, int productCount) {
        System.out.println("Vill du ta bort något?: J/N");
        String deleteProduct = Input.stringInput();

        if (deleteProduct.toLowerCase() == "j" && !productsList.isEmpty()) {
            System.out.println("Vad skulle du vilja ta bort? ");


            for (int i = 0; i < productsList.size(); i++) {
                int deletedRow = (i+1);
                System.out.println(productsList.get(i) +" VÄLJ NUMMER FÖR ATT RADERA: " + deletedRow);
            }
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
                "Produkt: " + productName + " -  " +
                " Antal: "  + productCount + " ||";
    }
}
