package com.solvd.carina.demo.gui.automationcomponents;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import lombok.Getter;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Getter
public class ProductItem extends AbstractUIObject {

    @FindBy(xpath = ".//h2[@class='product-title']/a")
    private ExtendedWebElement productName;

    @FindBy(xpath = ".//span[contains(@class, 'actual-price')]")
    private ExtendedWebElement productPrice;

    @FindBy(xpath = ".//button[contains(@class, 'product-box-add-to-cart-button')]")
    private ExtendedWebElement addToCartButton;

    public ProductItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void addToCart() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton.getElement()));

        addToCartButton.click();
    }

    public String getName() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(productName.getElement()));

        return productName.getText();
    }

    public String getPrice() {
        return productPrice.getText();
    }
}
