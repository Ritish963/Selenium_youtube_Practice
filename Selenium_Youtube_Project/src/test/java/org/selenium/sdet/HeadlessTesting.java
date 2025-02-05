package org.selenium.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class HeadlessTesting {

    @Test
    void test()
    {
        EdgeOptions opt = new EdgeOptions();
        opt.addArguments("--headless=new");
        EdgeDriver driver = new EdgeDriver(opt);
        driver.get("https://demo.nopcommerce.com/");
      //Ideally it should work but failing not sure, but syntax is correct


        driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("vivo");
        driver.findElement(By.xpath("//button[@class='button-1 search-box-button']")).click();
    }
}
