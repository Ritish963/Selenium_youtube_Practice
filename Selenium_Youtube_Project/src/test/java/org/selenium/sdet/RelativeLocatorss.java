package org.selenium.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RelativeLocatorss {

    @Test
    void test()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationbookstore.dev/");
        driver.manage().window().maximize();
      WebElement element = driver.findElement(RelativeLocator.with(By.tagName("li")).above(By.id("pid5")).toLeftOf(By.id("pid2")));

    String idName=  element.getAttribute("id");
    System.out.println(idName);
        Assert.assertEquals("pid1",idName);


    }
}
