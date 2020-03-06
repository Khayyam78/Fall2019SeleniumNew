package com.automation.test.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumScript {
    public static void main(String[] args) {
        // Setup chromedriver
        WebDriverManager.chromedriver().setup();
        // Create chromedriver object
        ChromeDriver driver = new ChromeDriver();
        // open some website
        driver.get("http://google.com");
    }
}
