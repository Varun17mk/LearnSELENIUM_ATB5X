package com.ATB5X.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium03 {
    @Test
    public void testMethod(){

        // Add Adbloker extension on Youtube using selenium args

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addExtensions(new File("C:\\Users\\HP\\Downloads\\Adblock-for-Youtube™.crx"));
//        edgeOptions.addArguments("--window-name=\"Its VARUN'S WINDOW\"");
//        edgeOptions.addArguments("--window-size=800,60");
        edgeOptions.addArguments("--start-maximized"); // Maximise window of Edge
        WebDriver driver= new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

//        driver.close(); // Closes current window only and Session_id =not null
        driver.quit(); // Closes the entire browser and  Session_id=null

    }
}
