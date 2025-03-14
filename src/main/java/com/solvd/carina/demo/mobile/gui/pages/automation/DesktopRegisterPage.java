package com.solvd.carina.demo.mobile.gui.pages.automation;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = RegisterPageBase.class)
public class DesktopRegisterPage extends RegisterPageBase{

    @FindBy(id = "gender-male")
    private ExtendedWebElement genderMale;

    @FindBy(id = "gender-female")
    private ExtendedWebElement genderFemale;

    @FindBy(id = "FirstName")
    private ExtendedWebElement firstName;

    @FindBy(id = "LastName")
    private ExtendedWebElement lastName;

    @FindBy(id = "Email")
    private ExtendedWebElement email;

    @FindBy(id = "Company")
    private ExtendedWebElement companyName;

    @FindBy(id = "Newsletter")
    private ExtendedWebElement newsletterCheckbox;

    @FindBy(id = "Password")
    private ExtendedWebElement password;

    @FindBy(id = "ConfirmPassword")
    private ExtendedWebElement confirmPassword;

    @FindBy(id = "register-button")
    private ExtendedWebElement registerButton;

    public DesktopRegisterPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void selectMaleGender() {
        genderMale.click();
    }

    @Override
    public void writeFirstName(String firstName) {
        this.firstName.type(firstName);
    }

    @Override
    public void writeLastName(String lastName) {
        this.lastName.type(lastName);
    }

    @Override
    public void writeEmail(String email) {
        this.email.type(email);
    }

    @Override
    public void writeCompanyName(String companyName) {
        this.companyName.type(companyName);
    }

    @Override
    public void clickNewsletter() {
        this.newsletterCheckbox.click();
    }

    @Override
    public void writePassword(String password) {
        this.password.type(password);
    }

    @Override
    public void confirmPassword(String password) {
        this.confirmPassword.type(password);
    }

    @Override
    public void register() {
        this.registerButton.click();
    }

}
