package com.qa.driver;

import com.qa.driver.factory.DriverFactory;
import com.qa.enums.BrowserExecutionType;
import com.qa.util.ReadPropertyUtil;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public final class Driver {

    private Driver(){}

    public static void initDriver() {
        if(Objects.isNull(DriverManager.getDriver())) {
            String mode = ReadPropertyUtil.getValue("browser.execution.type").toUpperCase();
            WebDriver driver = DriverFactory.get(BrowserExecutionType.valueOf(mode));
            DriverManager.setDriver(driver);
        }
    }

    public static void quitDriver() {
        if(Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unloadDriver();
        }
    }
}
