package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
       driver.findElement(By.name("q")).sendKeys("https://www.facebook.com/");
       driver.findElement(By.className("gNO89b")).submit();
       driver.navigate().to("https://www.facebook.com");
       Thread.sleep(3000);
       driver.findElement(By.id("email")).sendKeys("ritish");
        Thread.sleep(3000);
       driver.navigate().refresh();

        Thread.sleep(3000);
       driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        driver.quit();




    }
}
