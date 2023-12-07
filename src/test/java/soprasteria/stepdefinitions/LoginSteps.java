package soprasteria.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import soprasteria.pages.LoginPage;
import soprasteria.utilities.Driver;


public class LoginSteps {
   LoginPage loginPage= new LoginPage();

@Given("User navigates to app url")
public void User_navigates_to_app_url()  {
    loginPage.homePage();

    }

    @When("User searches {string}")
    public void user_searches(String text)  {

       loginPage.search(text);
        Driver.closeDriver();

    }

}


