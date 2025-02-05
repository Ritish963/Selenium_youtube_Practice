package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicHtmlControls {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
        driver.findElement(By.id("femalerb")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("englishchbx")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("hindichbx")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("registerbtn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("clearbtn")).click();


    }
}
