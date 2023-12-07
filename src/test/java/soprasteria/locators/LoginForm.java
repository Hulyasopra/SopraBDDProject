package soprasteria.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import soprasteria.utilities.Driver;

public class LoginForm {

    public LoginForm() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(name = "q")
    public WebElement searchBox;
    @FindBy(xpath = "//*[@id=\"L2AGLb\"]/div")
    public WebElement popUpClose;


}
