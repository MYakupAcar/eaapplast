package pages;

import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class CreateUserPage {

    public CreateUserPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="Name")
    public WebElement nameButton;
    @FindBy(id="Salary")
    public WebElement salaryButton;
    @FindBy(id="Grade")
    public WebElement gradeButton;
    @FindBy(id="DurationWorked")
    public WebElement workedDurationButton;
    @FindBy(id="Email")
    public WebElement emailButton;

    @FindBy(linkText="Create New")
    public WebElement createNewButton;

    @FindBy(xpath="//input[@type=\"submit\"]")
    public WebElement createSubmitButton;

    @FindBy(xpath = "//tr/td[5]")
    public List<WebElement> emailList;

    @FindBy (linkText = "Delete" )
    public List<WebElement> deleteButton2;

    @FindBy (xpath = "//tr/td/a[3]")
    public List<WebElement> deleteButton;

    @FindBy (xpath = "//input[@value='Delete']")
    public WebElement secondDeleteButton;

    @FindBy (xpath = "//input[@placeholder='Search Name']")
    public WebElement searchBox;

    @FindBy (xpath = "//input[@value='Search']")
    public WebElement searchButton;

    @FindBy (xpath = "//table/tbody/tr")
    public List<WebElement> searchResult;


    public void addNewUser(String name, String salary, String workedDuration, String grade, String email){

        nameButton.sendKeys(name);
        salaryButton.sendKeys(salary);
        workedDurationButton.sendKeys(workedDuration);
        gradeButton.sendKeys(grade);
        emailButton.sendKeys(email);

    }
    public void clickCreate(){
        createSubmitButton.click();

    }


    public void checkemail(String email) {
        List<String> emaillist = new ArrayList<>();
        for (WebElement webElement : emailList) {
            emaillist.add(webElement.getText());
        }
        Assert.assertTrue(emaillist.contains(email));

    }

    public void clickCreateNewUser() {
        createNewButton.click();
    }

    public void searchUser(String userName){
        searchBox.click();
        searchBox.sendKeys(userName);
        searchButton.click();
    }

    public void deleteCheckViaEmail(String email){
        List<String> emaillist = new ArrayList<>();
        for (WebElement webElement : emailList) {
            emaillist.add(webElement.getText());
        }
        Assert.assertFalse(emailList.contains(email));
    }

    public void deleteCheckViaSearchBox(String userName){
        searchUser(userName);
        int count = searchResult.size();
        Assert.assertEquals(1, count);
    }
}
