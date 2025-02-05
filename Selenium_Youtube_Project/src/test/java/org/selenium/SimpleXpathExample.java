package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SimpleXpathExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();
        List<WebElement> webElements = driver.findElements(By.xpath("//table[@id='resultTable']//td[3][contains(text(), 'ESS')]/preceding-sibling::td[2]/input"));
        for(WebElement we:webElements)
        {
            we.click();
            Thread.sleep(2000);
        }

        driver.quit();

    }

    // write a method to check if the element is present or not
}