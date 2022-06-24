package com.qa.driver.factory;

import com.qa.driver.driverimpl.*;
import com.qa.enums.BrowserExecutionType;
import org.openqa.selenium.WebDriver;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class DriverFactory {

    private DriverFactory() {}

    private static final Map<BrowserExecutionType, Supplier<WebDriver>> MAP = new EnumMap<>(BrowserExecutionType.class);

    static {
        MAP.put(BrowserExecutionType.CHROME_LOCAL_BROWSER, new ChromeLocalBrowserImpl()::getDriver);
        MAP.put(BrowserExecutionType.CHROME_GRID_BROWSER, new ChromeGridBrowserImpl()::getDriver);
        MAP.put(BrowserExecutionType.CHROME_BS_BROWSER, new ChromeBrowserStackBrowserImpl()::getDriver);
        MAP.put(BrowserExecutionType.FIREFOX_LOCAL_BROWSER, new FirefoxLocalBrowserImpl()::getDriver);
        MAP.put(BrowserExecutionType.FIREFOX_GRID_BROWSER, new FirefoxGridBrowserImpl()::getDriver);
        MAP.put(BrowserExecutionType.FIREFOX_BS_BROWSER, new FirefoxBrowserStackBrowserImpl()::getDriver);
        MAP.put(BrowserExecutionType.EDGE_LOCAL_BROWSER, new EdgeLocalBrowserImpl()::getDriver);
        MAP.put(BrowserExecutionType.EDGE_BS_BROWSER, new EdgeBrowserStackBrowserImpl()::getDriver);
    }

    public static WebDriver get(BrowserExecutionType browserExecutionType) {
        return MAP.get(browserExecutionType).get();
    }
}
