package com.solvd.carina.demo;

import com.solvd.carina.demo.mobile.gui.pages.automation.HomePageBase;
import com.solvd.carina.demo.mobile.gui.pages.automation.LoginPageBase;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest implements IAbstractTest {

//    Test don't work due to Captcha
    @Test
    public void testLogin() {

        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        homePage.getHeaderUpper().getLoginButton().click();

        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);

        assertTrue(loginPage.isPageOpened(), "Login page did not open!");

        loginPage.login("jszczypek@sold.com", "123456");
    }
}
