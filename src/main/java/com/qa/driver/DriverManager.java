package com.qa.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {

    private DriverManager(){}

    private static final ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

    public static synchronized void setDriver(WebDriver driver) {
        threadLocalDriver.set(driver);
    }

    public static synchronized WebDriver getDriver() {
        return threadLocalDriver.get();
    }

    public static synchronized void unloadDriver() {
        threadLocalDriver.remove();
    }
}
