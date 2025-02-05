package org.selenium.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavascriptExecutorExample {


        @Test
        void javascipt() throws InterruptedException {

//        WebDriver driver = new ChromeDriver();
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://demo.nopcommerce.com/");
            driver.manage().window().maximize();

            //send keys using javascriptExecutor
            //JavascriptExecutor java =(JavascriptExecutor) driver;
            JavascriptExecutor java = driver;
            WebElement ele = driver.findElement(By.xpath("//input[@name='q']"));
            java.executeScript("arguments[0].setAttribute('value','vivo')",ele);


            //click using javascriptExecutor
//            WebElement element = driver.findElement(By.xpath("//button[text()='Search']"));
//            java.executeScript("arguments[0].click()",element);


            //scrolling down
//            java.executeScript("window.scrollBy(0,1000)");

            //scroll to particular element
            WebElement elem = driver.findElement(By.id("vote-poll-1"));
//            java.executeScript("arguments[0].scrollIntoView()",elem);

            //scroll to end of page
            java.executeScript("window.scrollBy(0,document.body.scrollHeight)");
            System.out.println(java.executeScript("return window.pageYOffset"));
            //for horizontal scroll
//            java.executeScript("window.scrollBy(0,document.body.scrollWidth)");
//         System.out.println(java.executeScript("return window.pageXOffset"));


            Thread.sleep(2000);
         //scroll back to starting of page
            java.executeScript("window.scrollBy(0,-document.body.scrollHeight)");


        }

    }


