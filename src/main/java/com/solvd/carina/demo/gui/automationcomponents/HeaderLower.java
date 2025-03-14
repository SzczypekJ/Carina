package com.solvd.carina.demo.gui.automationcomponents;

import com.zebrunner.carina.utils.IWebElement;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import lombok.Getter;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@Getter
public class HeaderLower extends AbstractUIObject {

    @FindBy(xpath = ".//img[@alt = 'nopCommerce demo store']")
    private ExtendedWebElement nopCommerce;

    @FindBy(id="small-searchterms")
    private ExtendedWebElement inputSearch;

    @FindBy(xpath = ".//button[@class='button-1 search-box-button']")
    private ExtendedWebElement searchButton;


    public HeaderLower(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
