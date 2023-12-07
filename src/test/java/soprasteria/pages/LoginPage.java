package soprasteria.pages;


import org.openqa.selenium.Keys;
import soprasteria.locators.LoginForm;
import soprasteria.utilities.BrowserUtils;
import soprasteria.utilities.ConfigurationReader;
import soprasteria.utilities.Driver;


public class LoginPage extends LoginForm {


    public void homePage() {
        BrowserUtils.waitFor(2);
        Driver.get().get(ConfigurationReader.get("app_url"));
        BrowserUtils.waitFor(2);
    }
    public void search(String text) {
        popUpClose.click();
        BrowserUtils.waitFor(2);
        searchBox.sendKeys(text, Keys.ENTER);
        BrowserUtils.waitFor(2);
    }

}



