package com.solvd.carina.demo;

import com.solvd.carina.demo.mobile.gui.pages.automation.HomePageBase;
import com.zebrunner.carina.core.IAbstractTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestListener;
import org.testng.annotations.Test;

public class SamsungTest implements IAbstractTest {

    @Test
    public void testSamsung() throws InterruptedException {

        WebDriver driver = getDriver();

        HomePageBase homePage = initPage(driver, HomePageBase.class);
        homePage.open();

        homePage.getHeaderLower().getInputSearch().type("Samsung Premium Ultrabook");
        homePage.getHeaderLower().getSearchButton().click();

        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[2]/button[1]")).click();
        Thread.sleep(5000);
    }
}
