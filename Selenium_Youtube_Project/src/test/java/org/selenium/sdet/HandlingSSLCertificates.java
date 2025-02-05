package org.selenium.sdet;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HandlingSSLCertificates {

    @Test
    void test()
    {
        ChromeOptions opt = new ChromeOptions();
        opt.setAcceptInsecureCerts(true);
        ChromeDriver driver = new ChromeDriver(opt);
        driver.get("http://expired.badssl.com/");

        System.out.println(driver.getTitle());
    }
}
