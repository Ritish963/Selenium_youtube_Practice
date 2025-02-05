package org.selenium.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandlingSliders {
        @Test
        void handleSlider()
        {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
//        WebElement element = driver.findElement(By.xpath("//div[@id=\"slider-range\"]/span[1]"));
//        System.out.println(element.getLocation());
//        actions.dragAndDropBy(element,1400,1970).perform();
//        System.out.println(element.getLocation());


            WebElement element2 = driver.findElement(By.xpath("//div[@id=\"slider-range\"]/span[2]"));
            System.out.println(element2.getLocation());
            actions.dragAndDropBy(element2,600,1970).perform();
            System.out.println(element2.getLocation());

            driver.quit();
        //slider is moving but getting exception not sure but functionality is working



    }
}
