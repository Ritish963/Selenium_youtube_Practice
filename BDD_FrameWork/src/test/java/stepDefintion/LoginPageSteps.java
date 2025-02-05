package stepDefintion;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
    LoginPage loginPage =new LoginPage();
    @Given("User is on login page")
    public void userIsOnLoginPage() {

    }

    @Then("user is navigated to home page")
    public void userIsNavigatedToHomePage() {
    }


    @When("User is able to enter valid credentials {string} and {string}")
    public void userIsAbleToEnterValidCredentialsAnd(String arg0, String arg1) {
    }


    @When("User is able to enter valid username and password")
    public void userIsAbleToEnterValidUsernameAndPassword() {
    }
}
