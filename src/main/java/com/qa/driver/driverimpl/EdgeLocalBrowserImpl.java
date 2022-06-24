package com.qa.driver.driverimpl;

import com.qa.driver.IDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public final class EdgeLocalBrowserImpl implements IDriver {
    @Override
    public WebDriver getDriver() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }
}
