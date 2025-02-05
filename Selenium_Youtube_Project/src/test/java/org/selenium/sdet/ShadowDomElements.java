package org.selenium.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShadowDomElements {

    @Test
    void shadowDom() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.automationtesting.in/shadow-dom");
        driver.manage().window().maximize();


        //inner shadow element
        SearchContext element = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
        Thread.sleep(2000);
        String text =  element.findElement(By.cssSelector("#shadow-element")).getText();
        System.out.println(text);


        //nested shadow element
//        SearchContext element = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
//        Thread.sleep(2000);
//        SearchContext element1 = element.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
//        Thread.sleep(2000);
//        String text =  element1.findElement(By.cssSelector("#nested-shadow-element")).getText();
//        System.out.println(text);

        //multi -nested shadow element

//        SearchContext element = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
//        Thread.sleep(2000);
//        SearchContext element1 = element.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
//        Thread.sleep(2000);
//        SearchContext element2 = element1.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
//        Thread.sleep(2000);
//      String text =  element2.findElement(By.cssSelector("#multi-nested-shadow-element")).getText();
//      System.out.println(text);
    }
}
