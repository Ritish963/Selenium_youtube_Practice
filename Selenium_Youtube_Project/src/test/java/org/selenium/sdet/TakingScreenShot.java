package org.selenium.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class TakingScreenShot {
    @Test
    void takescreenshot()
    {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

//        TakesScreenshot ts = driver;
//        File source = ts.getScreenshotAs(OutputType.FILE);
//        File target = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\file.png");
//        source.renameTo(target);


        //capturing particular area in a page
//        WebElement element = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
//        File source1 = element.getScreenshotAs(OutputType.FILE);
//        File target1 = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\product.png");
//        source1.renameTo(target1);

        //capturing particular webelement
        WebElement element1 = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File source2 = element1.getScreenshotAs(OutputType.FILE);
        File target2 = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\head.png");
        source2.renameTo(target2);
    }
}
