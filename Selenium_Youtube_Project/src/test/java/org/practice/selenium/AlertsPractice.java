package org.practice.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsPractice {


    private WebDriver webDriver ;
    @BeforeMethod
    public void homePage()
    {
        webDriver = new ChromeDriver();
        webDriver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        webDriver.manage().window().maximize();
    }

    @Test
    public void simpleAlert() throws InterruptedException {
        webDriver.findElement(By.id("alertBox")).click();
        Thread.sleep(2000);
        Alert alert = webDriver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
    }
    @Test
    public void confirmAlert() throws InterruptedException {
        webDriver.findElement(By.id("confirmBox")).click();
        Thread.sleep(2000);
        Alert alert = webDriver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.dismiss();
        System.out.println(webDriver.findElement(By.id("output")).getText());
    }
    @Test
    public void promptAlert() throws InterruptedException {
        webDriver.findElement(By.id("promptBox")).click();
        Thread.sleep(2000);
        Alert alert = webDriver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.sendKeys("RitishBabu");
        alert.accept();
        System.out.println(webDriver.findElement(By.id("output")).getText());
    }


    @AfterMethod
    public void closeBrowser()
    {
        webDriver.quit();
    }
}
