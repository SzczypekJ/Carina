package com.solvd.carina.demo.mobile.gui.pages.automation;

import com.solvd.carina.demo.gui.automationcomponents.HeaderLower;
import com.solvd.carina.demo.gui.automationcomponents.HeaderUpper;
import com.solvd.carina.demo.mobile.gui.pages.common.ChartsPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@Getter
@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageBase.class)
public class DesktopHomePage extends HomePageBase {

    public DesktopHomePage(WebDriver driver) {
        super(driver);
    }
}
