package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PageLoadTime {
    public static void main(String[] args) {
        // write a method to calculate the page load time

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        driver.manage().window().maximize();
    }
}
