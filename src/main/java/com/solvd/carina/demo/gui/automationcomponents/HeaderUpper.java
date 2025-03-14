package com.solvd.carina.demo.gui.automationcomponents;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import lombok.Getter;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@Getter
public class HeaderUpper extends AbstractUIObject {

    @FindBy(xpath = ".//a[@class = 'ico-register']")
    private ExtendedWebElement registerButton;

    @FindBy(xpath = ".//a[@class='ico-login']")
    private ExtendedWebElement loginButton;

    @FindBy(xpath = ".//a[@class = 'ico-cart']")
    private ExtendedWebElement cartButton;

    public HeaderUpper(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
