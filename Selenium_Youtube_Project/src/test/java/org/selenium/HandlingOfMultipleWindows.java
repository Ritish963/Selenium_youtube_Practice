package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingOfMultipleWindows {

    @Test
    public void disp() throws InterruptedException {
        WebDriver webDriver =new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String parentHandle = webDriver.getWindowHandle();
        System.out.println(parentHandle);
        webDriver.findElement(By.id("newWindowBtn")).click();
        for(String str:webDriver.getWindowHandles())
        {
            if(!parentHandle.equals(str))
            {
                System.out.println(str);
                webDriver.switchTo().window(str);
                webDriver.findElement(By.id("firstName")).sendKeys("ritish");
                Thread.sleep(5000);
                webDriver.close();
            }
        }
        Thread.sleep(2000);
        webDriver.switchTo().window(parentHandle);
        webDriver.findElement(By.id("name")).sendKeys("yadagiri");
    }
}
