package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by user on 25/08/2017.
 */

public class BasketTest {

    Basket basket;
    Apple apple;
    Banana banana;

    @Before
    public void before(){
        basket = new Basket();
        apple = new Apple(0.25, "Own Brand", "Braeburn");
        banana = new Banana(0.45, "Chiquita");
    }

    @Test
    public void canAddToBasket(){
        basket.add(banana);

    }

}
