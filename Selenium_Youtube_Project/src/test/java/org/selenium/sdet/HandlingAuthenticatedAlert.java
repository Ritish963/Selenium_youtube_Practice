package org.selenium.sdet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingAuthenticatedAlert {

    @Test
    public void authenticatedAlert()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/basic_auth");

//        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

    }
}
