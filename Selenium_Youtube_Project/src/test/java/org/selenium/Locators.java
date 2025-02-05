package org.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class Locators {
    public static void main(String [] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
//       WebElement element= driver.findElement(By.id("APjFqb"));
//        Actions actions = new Actions(driver);
//        actions.click(element)
//                .sendKeys("ipl 2024")
//                .perform();
//        actions.sendKeys(Keys.ENTER).perform();
//        driver.findElement(By.xpath("(//div[@class='yuRUbf'])[1]//a")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//*[@id='myHeader']/div/div[2]/div[2]/ul/li[4]/a")).click();


        //        driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
//        driver.findElement(By.partialLinkText("Forgotten")).click();
//        driver.get("https://www.iplt20.com/points-table/men");
//        List<WebElement> webElements = driver.findElements(By.xpath("(//table[@class='ih-td-tab'])[1]//tbody[2]//tr[td[11][text()='14']]/td[3]//h2"));
//        webElements.forEach(webElement -> {
//            System.out.println(webElement.getText());
//        });

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://selectorshub.com/xpath-practice-page/");
//        List<WebElement> webElements2 = driver.findElements(By.xpath("//table[@id='resultTable']//tbody//tr[td[3][text()='ESS']]/td[1]/input"));
//        webElements2.forEach(webElement -> {
//            wait.until(ExpectedConditions.elementToBeClickable(webElement));
//            webElement.click();
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
    WebElement webElement2 = driver.findElement(By.xpath("//div[@id='tablepress-1_length']//select"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", webElement2);
        Select select = new Select(webElement2);
        select.selectByValue("100");
    }
}
