package org.selenium.sdet;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class LaunchingIncognitoMode {

    @Test
    void test() {
//        EdgeOptions opt = new EdgeOptions();
//        opt.addArguments("--inprivate");
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--incognito");
//        EdgeDriver driver = new EdgeDriver(opt);
        ChromeDriver driver = new ChromeDriver(opt);
        driver.get("https://demo.nopcommerce.com/");


    }
    }
