package com.example.user.shoppingbasket;

/**
 * Created by user on 25/08/2017.
 */

public abstract class Item {

    private double price;
    private String brand;

    public Item(Double price, String brand){
        this.price = price;
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

}
