package com.solvd.carina.demo.mobile.gui.pages.automation;

import com.solvd.carina.demo.gui.automationcomponents.HeaderLower;
import com.solvd.carina.demo.gui.automationcomponents.HeaderUpper;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@Getter
public class AbstractBasePage extends AbstractPage {

    @FindBy(xpath = "//div[@class='header-upper']")
    private HeaderUpper headerUpper;

    @FindBy(xpath = "//div[@class='header-lower']")
    private HeaderLower headerLower;

    public AbstractBasePage(WebDriver driver) {
        super(driver);
    }
}
