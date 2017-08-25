package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

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
        basket.add(apple);
    }

    @Test
    public void canAddToBasket(){
        assertEquals(1, basket.itemCount());
    }

    @Test
    public void canAddMultipleToBasket(){
        basket.add(banana);
        basket.add(banana);
        assertEquals(3, basket.itemCount());
    }

    @Test
    public void canEmptyBasket(){
        basket.add(banana);
        basket.clearBasket();
        assertEquals(0, basket.itemCount());
    }

    @Test
    public void canRemoveItemFromBasket(){
        basket.add(banana);
        basket.removeItem(apple);
        assertEquals(1, basket.itemCount());
    }

    @Test
    public void canCalculateTotal(){
        basket.add(apple);
        basket.add(banana);
        assertEquals(0.95, basket.calculateTotal());
    }

}
