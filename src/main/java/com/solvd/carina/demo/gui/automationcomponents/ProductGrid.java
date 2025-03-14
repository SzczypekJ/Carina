package com.solvd.carina.demo.gui.automationcomponents;

import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import lombok.Getter;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class ProductGrid extends AbstractUIObject {

    @FindBy(xpath = ".//div[contains(@class, 'item-box')]")
    private List<ProductItem> products;

    public ProductGrid(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
