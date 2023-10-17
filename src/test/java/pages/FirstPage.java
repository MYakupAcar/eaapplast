package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FirstPage {


    public FirstPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(linkText = "Employee List")
    public WebElement employeeListButton;


    public void navigateToEmployeeList() {
        employeeListButton.click();
    }
}
