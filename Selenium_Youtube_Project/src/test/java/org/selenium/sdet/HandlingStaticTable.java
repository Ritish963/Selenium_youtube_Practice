package org.selenium.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingStaticTable {

    @Test
    void staticTable()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        int rowSize = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        int columnSize = driver.findElements(By.xpath("//table[@name='BookTable']//tr/th")).size();
        for(int i=2;i<=rowSize;i++)
        {
            for(int j=1;j<=columnSize;j++)
            {
              String text =  driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
              System.out.print(text+" ");
            }
            System.out.println();
        }
    }

    @Test
    void addPriceOfBook()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        int rowSize = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        int sum=0;
        for(int i=2;i<=rowSize;i++)
        {
            String text = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[4]")).getText();
          int num= Integer.parseInt(text);
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
