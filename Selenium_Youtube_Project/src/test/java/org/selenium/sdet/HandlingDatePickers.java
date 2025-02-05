package org.selenium.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingDatePickers {

    static void futureDate(WebDriver driver,String Month,String Year,String date)
    {

        while (true) {
            String month = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
            String year = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();

            if (Month.equals(month) && Year.equals(year)) {
                break;
            }

            driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
        }

        while (true) {
            List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td/a"));
            for (WebElement web : dates) {
                if (web.getText().equals(date)) {
                    web.click();
                    break;
                }
            }
        }

    }

    static void pastDate(WebDriver driver,String Month,String Year,String date)
    {

        while (true) {
            String month = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
            String year = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();

            if (Month.equals(month) && Year.equals(year)) {
                break;
            }

            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
        }

        while (true) {
            List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td/a"));
            for (WebElement web : dates) {
                if (web.getText().equals(date)) {
                    web.click();
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        futureDate(driver,"August","2025","20");
//        pastDate(driver,"August","2023","20");


    }

}
