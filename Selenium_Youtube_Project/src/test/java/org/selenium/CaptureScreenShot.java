package org.selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class CaptureScreenShot {
    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        // write a method to capture the screenshot
        TakesScreenshot Ts= (TakesScreenshot) driver;
        File file=Ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("./Screenshots/image1.png"));
        driver.quit();

    }
}