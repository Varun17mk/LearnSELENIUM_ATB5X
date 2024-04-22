package com.ATB5X.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium_02 {
    @Test
    public void testMethod(){

        // Add Adbloker extension on Youtube using selenium args

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addExtensions(new File("C:\\Users\\HP\\Downloads\\Adblock-for-Youtube™.crx"));
        WebDriver driver= new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com");
//        edgeOptions.
    }
}
