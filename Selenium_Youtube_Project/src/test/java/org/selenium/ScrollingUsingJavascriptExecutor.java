package org.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ScrollingUsingJavascriptExecutor {
    public static void main(String[] args) {
        // write a method to scroll the page using javascript
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollTo(0,1000)");
        js.executeScript("dcoument.getElementById('BlogArchive1_ArchiveMenu').scrollIntoView()");
//        js.executeScript("window.scrollTo(0,window.body.scrollHeight)");

    }
}
