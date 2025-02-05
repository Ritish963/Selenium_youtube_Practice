package org.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Locators {


    private WebDriver webDriver ;
    @BeforeMethod
    public void homePage()
    {
        webDriver = new ChromeDriver();
        webDriver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
        webDriver.manage().window().maximize();
    }

    @Test
    public void locators()
    {
        webDriver.findElement(By.cssSelector("input[name='fname']")).sendKeys("ritish");
        webDriver.findElement(By.id("lastName")).sendKeys("babu");
        webDriver.findElement(By.linkText("Click Here")).click();
    }

    @AfterMethod
    public void closeBrowser()
    {
        webDriver.quit();
    }
}
