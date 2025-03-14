package com.solvd.carina.demo;

import com.solvd.carina.demo.mobile.gui.pages.automation.AbstractBasePage;
import com.solvd.carina.demo.mobile.gui.pages.automation.DesktopHomePage;
import com.solvd.carina.demo.mobile.gui.pages.automation.HomePageBase;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTest implements IAbstractTest {

    @Test
    public void mainPageTest() {

        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);

        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "The homepage did not open correctly!");
        Assert.assertEquals(homePage.getPageURL(), "https://demo.nopcommerce.com",
                "The opened website have wrong URL!");

        Assert.assertTrue(homePage.getHeaderLower().getNopCommerce().isElementPresent(),
                "The nopCommerce logo is not visible!");

        Assert.assertTrue(homePage.getHeaderUpper().getLoginButton().isElementPresent(),
                "The login button is not visible!");
        Assert.assertTrue(homePage.getHeaderUpper().getRegisterButton().isElementPresent(),
                "The register button is not visible!");
        Assert.assertTrue(homePage.getHeaderUpper().getCartButton().isElementPresent(),
                "The cart button is not visible!");


        Assert.assertTrue(homePage.getHeaderLower().getInputSearch().isElementPresent(),
                "The search input field is not visible!");
        Assert.assertTrue(homePage.getHeaderLower().getSearchButton().isElementPresent(),
                "The search button is not visible!");
    }
}