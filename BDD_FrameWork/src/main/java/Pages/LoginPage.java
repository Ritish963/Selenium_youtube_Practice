package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    WebDriver driver;

    public void getUrl(String url)
    {
        driver = new ChromeDriver();
        driver.get(url);
    }
}
