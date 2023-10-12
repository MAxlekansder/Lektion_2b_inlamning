package com.AlexanderHasslundShop.demo;

import com.AlexanderHasslund.demo.Input;

import java.util.ArrayList;
import java.util.List;

public class Products {

    List<Products> productsList = new ArrayList<>();
    private String productName;
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


    public void addProducts(String productName, int productCount) {

        System.out.print("Vad för produkt vill du lägga till?: ");
        setProductName(Input.stringInput());
        System.out.println("Hur många?: ");
        setProductCount(Input.intInput());
        
        productsList.add()
    }

    public void removeProducts(String productName, int productCount) {

    }

    public void displayProducts() {

    }
}
