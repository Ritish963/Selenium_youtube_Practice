package org.selenium.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class openingRegisterPageInNewTab {
    @Test
    void test()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       WebElement element = driver.findElement(By.xpath("//a[text()='Register']"));

        Actions actions = new Actions(driver);

        actions.keyDown(Keys.CONTROL).click(element).keyUp(Keys.CONTROL).perform();

        List<String> winds = new ArrayList<>(driver.getWindowHandles());

        winds.get(1);

        driver.switchTo().window(winds.get(1));

        driver.findElement(By.id("FirstName")).sendKeys("ritish");
        driver.findElement(By.id("LastName")).sendKeys("ritish");

        driver.switchTo().window(winds.get(0));

        driver.findElement(By.id("small-searchterms")).sendKeys("vivo");

        actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();

    }
}
