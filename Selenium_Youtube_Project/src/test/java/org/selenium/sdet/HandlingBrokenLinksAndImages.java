package org.selenium.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class HandlingBrokenLinksAndImages {

    @Test
    void test()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();
        int count=0;
        List<WebElement> elements = driver.findElements(By.tagName("a"));//replace a with img for handling broken images
        for(WebElement element1:elements)
        {
            String url = element1.getAttribute("href"); // replace href with src
            try{
            if(url==null || url.isEmpty())
            {
                System.out.println("not possible to check");
            }

            else
            {
                URL urlLink = new URL(url);
                HttpURLConnection con = (HttpURLConnection) urlLink.openConnection();
                con.connect();
                if(con.getResponseCode()>=400)
                {
                    System.out.println(urlLink+"---->brokenlink");
                    count++;
                }
                else {
                    System.out.println(urlLink+"---->normallink");
                }}

            }
            catch(Exception e)
            {

            }

        }
        System.out.println(count);
    }
}
