package com.solvd.carina.demo.mobile.gui.pages.automation;

import lombok.Getter;
import org.openqa.selenium.WebDriver;

@Getter
public abstract class RegisterPageBase extends AbstractBasePage {

    public RegisterPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void selectMaleGender();

    public abstract void writeFirstName(String firstName);

    public abstract void writeLastName(String lastName);

    public abstract void writeEmail(String email);

    public abstract void writeCompanyName(String companyName);

    public abstract void clickNewsletter();

    public abstract void writePassword(String password);

    public abstract void confirmPassword(String password);

    public abstract void register();
}
