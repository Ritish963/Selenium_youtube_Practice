package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingKeysUsingJavascriptExecutor {
    public static void main(String[] args) throws InterruptedException {
        // write a method to send the keys using javascript executor
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
       WebElement element= driver.findElement(By.cssSelector("#email"));
//        js.executeScript("document.getElementById('email').value='ritish123'");
        js.executeScript("arguments[0].value='ritish123'",element);
        Thread.sleep(2000);
        driver.quit();
    }
}
