package com.example.user.shoppingbasket;

/**
 * Created by user on 25/08/2017.
 */

public abstract class Item {

    private Double price;

    public Item(Double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
