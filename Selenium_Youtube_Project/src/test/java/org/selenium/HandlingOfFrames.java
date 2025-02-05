package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingOfFrames {

    @Test
    public void frame() throws InterruptedException {
        WebDriver webDriver =new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        webDriver.findElement(By.id("name")).sendKeys("Hello");
        Thread.sleep(2000);
        webDriver.switchTo().frame("frm3");
        Thread.sleep(2000);
        webDriver.findElement(By.id("name")).sendKeys("ritish");
        Thread.sleep(2000);
        webDriver.switchTo().frame("frm1");
        WebElement element =webDriver.findElement(By.id("course"));
        Select courseSelect = new Select(element);
        Thread.sleep(2000);
        courseSelect.selectByIndex(1);
        Thread.sleep(2000);
        webDriver.switchTo().parentFrame();
        Thread.sleep(2000);
        webDriver.findElement(By.id("name")).clear();
        webDriver.findElement(By.id("name")).sendKeys("Babu");
        Thread.sleep(2000);
        webDriver.switchTo().defaultContent();
        webDriver.findElement(By.id("name")).clear();
        webDriver.findElement(By.id("name")).sendKeys("HelloWorld");
        Thread.sleep(2000);

    }
}
