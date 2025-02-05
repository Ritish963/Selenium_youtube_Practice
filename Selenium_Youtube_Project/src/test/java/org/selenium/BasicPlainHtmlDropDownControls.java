package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class BasicPlainHtmlDropDownControls {

    @Test
    public void display() throws InterruptedException {
        WebDriver webDriver =new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        WebElement course = webDriver.findElement(By.id("course"));
        Select courseSelect = new Select(course);
//        courseSelect.selectByIndex(1);
//        Thread.sleep(2000);
//        courseSelect.selectByValue("net");
//        Thread.sleep(2000);
//        courseSelect.selectByVisibleText("Python");
//        Thread.sleep(2000);
        WebElement ideName = webDriver.findElement(By.id("ide"));
        Select ideNameSelect =new Select(ideName);

        ideNameSelect.selectByIndex(1);
        Thread.sleep(2000);
        ideNameSelect.selectByVisibleText("NetBeans");
        Thread.sleep(2000);
        ideNameSelect.selectByValue("vs");
        Thread.sleep(2000);

        System.out.println("all options");
        List<WebElement> listOfAllOptions = ideNameSelect.getOptions();
        for(WebElement wb:listOfAllOptions)
        {
            System.out.println(wb.getText());
        }
        System.out.println("only selected");
        List<WebElement> listOfSelected = ideNameSelect.getAllSelectedOptions();
        for(WebElement wb:listOfSelected)
        {
            System.out.println(wb.getText());
        }
        System.out.println("first selected option");

        WebElement firstSelectedOption = ideNameSelect.getFirstSelectedOption();
        System.out.println(firstSelectedOption.getText());

    }
}

