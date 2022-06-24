package com.qa.driver.driverimpl;

import com.qa.driver.IDriver;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public final class EdgeBrowserStackBrowserImpl implements IDriver {
    @SneakyThrows
    @Override
    public WebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("", "");
        capabilities.setCapability("", "");
        capabilities.setCapability("", "");
        capabilities.setCapability("", "");
        return new RemoteWebDriver(new URL(""), capabilities);
    }
}
