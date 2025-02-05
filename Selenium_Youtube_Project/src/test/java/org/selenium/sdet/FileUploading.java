package org.selenium.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploading {

    @Test
    void fileUpload()
    {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/upload");
        driver.manage().window().maximize();WebElement ele =driver.findElement(By.id("fileInput"));
                ele.sendKeys("C:\\Users\\ritish_babu\\Downloads\\DHL_STA 1.txt")

        ;

    }
}
