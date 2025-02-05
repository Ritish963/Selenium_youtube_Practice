package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    public static WebDriver driver;
    public void setup()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public void tearDown()
    {
        if(driver!=null)
        {
            driver.quit();
        }
    }
}
