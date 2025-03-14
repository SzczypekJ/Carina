package com.solvd.carina.demo;

import com.solvd.carina.demo.gui.automationcomponents.ProductItem;
import com.solvd.carina.demo.mobile.gui.pages.automation.HomePageBase;
import com.zebrunner.carina.core.IAbstractTest;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AddToCartTest implements IAbstractTest {

    @Test
    public void testAddAllProductsToCart() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();

        System.out.println(getDriver().getPageSource());

        ProductItem firstProduct = homePage.getProductGrid().getProducts().get(0);
//        Assert.assertFalse(products.isEmpty(), "No products found!");

//        ProductItem firstProduct = products.getFirst();
        firstProduct.getAddToCartButton().click();
    }
}
