package com.ATB5X.SeleniumProject.P1;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//        **Project #1 - TC ( Negative) - Invalid username, pass - Error message**
//
//        1. Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
//        2. **Find the Email id** and enter the email as admin@admin.com
//        3. **Find the pass inputbox** and enter password as admin.
//        4. Find and Click on the submit button
//        5. Verify that the error message is shown "Your email, password, IP address or location did not match"
//

public class Selenium06 {

    @Test(groups = "QA")
    @Description("verify the URL and title and produce allure report")
    public void TestVWO(){
        WebDriver driver =new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");



        // 2. **Find the Email id** and enter the email and password
        //  id, className, name, css Selector, xpath
        //  LinkText and PartialText which are only for <a>
        // <input
        // type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi">

        WebElement emailInputBox = driver.findElement(By.id("login-username")); // locates the username box
        emailInputBox.sendKeys("Varunm@kulkarni.com"); // Enters the value in email-address box
        driver.findElement(By.name("password")).sendKeys("Passw@rd");
        driver.findElement(By.id("js-login-btn")).click();

        try { // to avoid fast execution of webdriver a halt of 3secs is being introduced
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement errorMsg = driver.findElement(By.className("notification-box-description"));
        String errorMsgText = errorMsg.getText();
        Assert.assertEquals(errorMsgText,"Your email, password, IP address or location did not match");

//        driver.quit();



    }
}
