package com.example.user.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 25/08/2017.
 */

public class Basket {

    private ArrayList<Item> contents = new ArrayList<Item>();


    public void add(Item item) {
        contents.add(item);
    }

    public int itemCount() {
        return contents.size();
    }

    public void clearBasket() {
        contents.clear();
    }

    public void removeItem(Item item) {
        contents.remove(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : contents) {
            double price = item.getPrice();
            total = total + price;
        }
        return total;
    }
}
