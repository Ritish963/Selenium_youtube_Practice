package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionsClass {
    public static void main(String[] args) throws InterruptedException {
//        // write a method to perform the actions class
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
//        driver.manage().window().maximize();
//        // write a method to perform the actions class
//        Actions action = new Actions(driver);
//        WebElement imgElement = driver.findElement(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
////        WebElement imgElement = driver.findElement(By.xpath("//img[@src='https://static-assets-web.flixcart.com/www/linchpin/batman-returns/images/fk-default-image-75ff340b.png?q=90']"));
//        WebElement imgElement1 = driver.findElement(By.id("trash"));
////       action.moveToElement(imgElement).doubleClick().build().perform();
//        action.dragAndDrop(imgElement,imgElement1).build().perform();
//       Thread.sleep(5000);
//       driver.quit();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Wait up to 10 seconds

        // Locate the draggable element
        WebElement draggableElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/ul/li[3]/img")));
        // Locate the draggable element (example using the first li element)



        // Locate the droppable target (example using the trash bin)
        WebElement droppableTarget = driver.findElement(By.id("trash"));

        // Perform drag-and-drop operation
        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggableElement, droppableTarget).build().perform();

        Thread.sleep(5000); // For demonstration purpose, you can remove this in actual tests

        driver.quit();
    }

}
