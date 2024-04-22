package com.ATB5X.Selenium;

import com.beust.ah.A;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_05 {

//        verify the URL and title and produce allure report

    @Test(groups = "QA")
    @Description("verify the URL and title and produce allure report")
    public void TestVWO(){
        WebDriver driver =new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        driver.quit();
    }
}
