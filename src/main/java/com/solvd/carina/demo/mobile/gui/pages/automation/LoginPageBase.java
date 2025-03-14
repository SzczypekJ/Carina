package com.solvd.carina.demo.mobile.gui.pages.automation;

import org.openqa.selenium.WebDriver;

public abstract class LoginPageBase extends AbstractBasePage {

    public LoginPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void login(String email, String password);
}
