package com.example.user.shoppingbasket;

/**
 * Created by user on 25/08/2017.
 */

public class Apple extends Item {

    String type;

    public Apple(double price, String brand, String type) {
        super(price, brand);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
