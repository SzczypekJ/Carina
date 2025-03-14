package com.solvd.carina.demo.mobile.gui.pages.automation;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = LoginPageBase.class)
public class DesktopLoginPage extends LoginPageBase {

    @FindBy(id = "Email")
    private ExtendedWebElement email;

    @FindBy(id = "Password")
    private ExtendedWebElement password;

    @FindBy(xpath = "//button[@class='button-1 login-button']")
    private ExtendedWebElement loginButton;

    public DesktopLoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void login(String email, String password) {
        this.email.type(email);
        this.password.type(password);
        this.loginButton.click();
    }
}
