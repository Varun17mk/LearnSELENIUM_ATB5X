package com.ATB5X.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

//Opening a website through Selenium

public class Selenium_01 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.co.in/");
        driver.quit();
        /* Selenium Flow
         * 1. Create Session, ID - q09876q789e8wq89we87
         * 2. Session -> Run the commands - GET -> GET Method w3c Protocol
         * 3. EdgeDriver (Server) -> Tell the Edge Browser
         * 4. Open a Fresh copy of thre Edge Browser and Open the URL - https://www.google.co.in/
         * 5. Driver - Command (POST) Request - Shutdown the browser.
         * */

    }
}
