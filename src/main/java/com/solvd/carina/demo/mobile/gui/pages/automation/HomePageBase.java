package com.solvd.carina.demo.mobile.gui.pages.automation;

import com.solvd.carina.demo.gui.automationcomponents.ProductGrid;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@Getter
public abstract class HomePageBase extends AbstractBasePage {

    @FindBy(className = "item-grid")
    private ProductGrid productGrid;

    public HomePageBase(WebDriver driver) {
        super(driver);
    }
}
