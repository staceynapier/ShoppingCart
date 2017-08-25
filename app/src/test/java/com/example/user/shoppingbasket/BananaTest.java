package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 25/08/2017.
 */

public class BananaTest {

    Banana banana;

    @Before
    public void before() {
        banana = new Banana(0.50, "Del Monte");
    }

    @Test
    public void hasPrice(){
        assertEquals(0.50, banana.getPrice());
    }

    @Test
    public void hasBrand(){
        assertEquals("Del Monte", banana.getBrand());
    }
}
