import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.IOException;

public class MyStepdefs {

    private WebDriver driver;
    private String excelFilePath = "C:/Users/ritish_babu/Downloads/login_data.xlsx"; // Update with your Excel file path
    private String facebookUrl = "https://www.facebook.com/";

    @Given("User is on login page")
    public void userIsOnLoginPage() {

        driver = new EdgeDriver();
        driver.get(facebookUrl);
    }

    @When("User logs in with data from Excel file")
    public void userLogsInWithDataFromExcelFile() throws IOException {

        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String username = row.getCell(0).getStringCellValue();
            String password = row.getCell(1).getStringCellValue();

            // Execute login
            driver.findElement(By.id("email")).sendKeys(username);
            driver.findElement(By.id("pass")).sendKeys(password);
            driver.findElement(By.name("login")).click();

            // Add verification logic (optional)
            boolean isLoggedIn = driver.findElement(By.id("userNavigationLabel")).isDisplayed();
            if (isLoggedIn) {
                System.out.println("User logged in successfully with username: " + username);
            } else {
                System.out.println("Login failed for username: " + username);
            }

            // Navigate back to login page for next iteration (optional)
            driver.get(facebookUrl);
        }

        workbook.close();
        inputStream.close();
    }

    @Then("User is logged in successfully")
    public void userIsLoggedInSuccessfully() {
        // Verification logic can be added here if needed after each login attempt
    }
}
