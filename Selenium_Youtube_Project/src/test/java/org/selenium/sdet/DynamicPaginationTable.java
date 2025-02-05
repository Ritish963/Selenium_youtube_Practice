package org.selenium.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicPaginationTable {

    @Test
    void dynamicPaginationTable()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        int pages = driver.findElements(By.xpath("//ul[@class='pagination']/li")).size();
        int rowSize = driver.findElements(By.xpath("//table[@id='productTable']//tr//td[1]")).size();
        int columnSize = driver.findElements(By.xpath("//table[@id='productTable']//tr[1]/td")).size();

        for(int i=1;i<=pages;i++)
        {
            if(i>1)
            {
                driver.findElement(By.xpath("//ul[@class='pagination']/li["+i+"]")).click();
            }
            for(int j=1;j<=rowSize;j++)
            {
                for(int k=1;k<=columnSize;k++)
                {
                if(k==4)
                {
                    driver.findElement(By.xpath("(//table[@id='productTable']//tr["+j+"]/td["+k+"])/input")).click();
                }
               System.out.print(driver.findElement(By.xpath("//table[@id='productTable']//tr["+j+"]/td["+k+"]")).getText()+" ");
            }
                System.out.println();
        }
        }
    }
}
