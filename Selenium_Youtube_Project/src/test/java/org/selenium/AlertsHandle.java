package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AlertsHandle {

    @Test
    public void show() throws InterruptedException {
        WebDriver webDriver =new ChromeDriver();
        webDriver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        webDriver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

        //simple alert

//        webDriver.findElement(By.id("alertBox")).click();
//        Thread.sleep(2000);
//        Alert alertMessage = webDriver.switchTo().alert();
//        System.out.println(alertMessage.getText());
//        Thread.sleep(2000);
//        alertMessage.accept();

        //confirmAlert
//        webDriver.findElement(By.id("confirmBox")).click();
//        Thread.sleep(2000);
//        Alert alertMessag = webDriver.switchTo().alert();
//        System.out.println(alertMessag.getText());
//        Thread.sleep(2000);
//        alertMessag.dismiss();
//        System.out.println(webDriver.findElement(By.id("output")).getText());


//        Prompt alert
//        webDriver.findElement(By.id("promptBox")).click();
//        Thread.sleep(2000);
//        Alert alertMessa = webDriver.switchTo().alert();
//        System.out.println(alertMessa.getText());
//        Thread.sleep(2000);
//        alertMessa.sendKeys("ritishBabu");
//        Thread.sleep(5000);
//        alertMessa.accept();
//        System.out.println(webDriver.findElement(By.id("output")).getText());

        //capturing alert with the help of explicit wait

        webDriver.findElement(By.id("alertBox")).click();
        Thread.sleep(3000);
       Alert alert= wait.until(ExpectedConditions.alertIsPresent());
       System.out.println(alert.getText());
       alert.accept();

    }
}
