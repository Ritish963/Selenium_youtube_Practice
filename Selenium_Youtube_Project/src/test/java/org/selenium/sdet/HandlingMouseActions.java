package org.selenium.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseActions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //hovering of an element
       WebElement element= driver.findElement(By.xpath("//button[@class='dropbtn']"));
        WebElement element2= driver.findElement(By.xpath("//a[text()='Laptops']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).moveToElement(element2).perform();

        //double click
        WebElement elem= driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
        actions.doubleClick(elem).click().perform();

        //rightclick
        WebElement elem1= driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
        actions.contextClick(elem1).click().perform();


        //drag and drop
        WebElement source= driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        actions.dragAndDrop(source,target).perform();
    }

}
