package com.qa.tests;

import com.google.common.util.concurrent.Uninterruptibles;
import com.qa.driver.DriverManager;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstTest extends BaseTest {

    @Test
    public void firstGoogleTest1() {
        DriverManager.getDriver().get("https://askomdch.com");
        DriverManager.getDriver().manage().window().maximize();
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    }
}
