package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 25/08/2017.
 */

public class AppleTest {

    Apple apple;

    @Before
    public void before() {
        apple = new Apple(0.30, "Golden Delicious");
    }

    @Test
    public void hasPrice(){
        assertEquals(0.30, apple.getPrice());
    }

    @Test
    public void hasType(){
        assertEquals("Golden Delicious", apple.getType());
    }
}
