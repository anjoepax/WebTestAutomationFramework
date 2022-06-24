package com.qa.driver.driverimpl;

import com.qa.driver.IDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class ChromeLocalBrowserImpl implements IDriver {
    @Override
    public WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
