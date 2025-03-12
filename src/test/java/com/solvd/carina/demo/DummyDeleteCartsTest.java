package com.solvd.carina.demo;

import com.solvd.carina.demo.api.DeleteCartsMethodsDummy;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.annotations.Test;

public class DummyDeleteCartsTest implements IAbstractTest {

    @Test
    public void testDeleteCart() {
        int cartId = 1; // ID koszyka do usunięcia
        DeleteCartsMethodsDummy deleteCartMethod = new DeleteCartsMethodsDummy(cartId);

        deleteCartMethod.callAPIExpectSuccess();
    }
}
