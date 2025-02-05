package org.selenium.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HandlingAutoSuggestionDropDown {
    private WebDriver driver;
    @Test
    void autoSuggestDropdown() {
         driver = new ChromeDriver();
        driver.get("https://www.bjs.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@placeholder='What are you looking for today?' ]")).sendKeys("vivo");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> list = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@auto-data='searchBar_searchRedirectedPage']//b")));
        System.out.println(list.size());

        for (WebElement web : list) {
            try {
                if (web.getText().contains("vivoactive 5")) {
                    web.click();

                }
            } catch (Exception e) {
                list = driver.findElements(By.xpath("//a[@auto-data='searchBar_searchRedirectedPage']//b"));
            }
        }
    }
        @AfterTest
        void tearDown()
        {
            driver.quit();
        }

}
