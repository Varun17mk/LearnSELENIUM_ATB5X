package com.ATB5X.Selenium;

import org.openqa.selenium.edge.EdgeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Selenium_04 {
    public static void main(String[] args) throws MalformedURLException {
        EdgeDriver driver= new EdgeDriver();
        driver.get("https://www.google.com/"); // No forward or backward options for get Hence navigate().to() is used

        driver.navigate().to("https://courses.thetestingacademy.com/");
        driver.navigate().to(new URL("https://restful-booker.herokuapp.com/apidoc/index.html"));
        driver.navigate().back();
//        driver.navigate().refresh();
//        driver.navigate().forward();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


    }
}
