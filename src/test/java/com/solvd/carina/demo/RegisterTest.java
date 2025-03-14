package com.solvd.carina.demo;

import com.solvd.carina.demo.mobile.gui.pages.automation.HomePageBase;
import com.solvd.carina.demo.mobile.gui.pages.automation.RegisterPageBase;
import com.zebrunner.carina.core.IAbstractTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class RegisterTest implements IAbstractTest {

    // Register not working due to captha
    @Test
    public void testRegister() {

        HomePageBase basePage = initPage(getDriver(), HomePageBase.class);
        basePage.open();

        basePage.getHeaderUpper().getRegisterButton().click();

        RegisterPageBase registerPage = initPage(getDriver(), RegisterPageBase.class);

        assertTrue(registerPage.isPageOpened(), "Register page did not open!");

        registerPage.selectMaleGender();

        String firstName = "Jakub";
        registerPage.writeFirstName(firstName);

        String lastName = "Szczypek";
        registerPage.writeLastName(lastName);

        String email = "jszczypek@solvd.com";
        registerPage.writeEmail(email);

        String companyName = "Solvd";
        registerPage.writeCompanyName(companyName);

        registerPage.clickNewsletter();

        String password = "123456";
        registerPage.writePassword(password);
        registerPage.confirmPassword(password);

        registerPage.register();
    }
}
