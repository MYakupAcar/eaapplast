package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginPage {


    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "UserName")
    private WebElement userName;

    @FindBy(id = "Password")
    private WebElement password;

    @FindBy(xpath = "//input[@type=\"submit\"]")
    private WebElement submitButton;


    public void fillTheUserNameAndPasswordBox() {
        userName.sendKeys(ConfigReader.getProperty("userName"));
        password.sendKeys(ConfigReader.getProperty("password"));
    }
    public void clickSubmitButton(){
        submitButton.click();
    }
}

