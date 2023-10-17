package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.CreateUserPage;
import pages.FirstPage;
import utilities.Driver;


public class DeleteUserStepDefinition {

    CreateUserPage employeer = new CreateUserPage();
    FirstPage firstPage = new FirstPage();


    @When("User click delete button for new added one")
    public void userClickDeleteButtonForNewAddedOne() throws InterruptedException {
        int a = employeer.deleteButton.size();


        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("window.scrollBy(0,3500)");

        employeer.deleteButton.get(a-1).click();


    }

    @And("User click delete button again")
    public void userClickDeleteButtonAgain() {
        employeer.secondDeleteButton.click();
    }

    @Then("Verify that new added user is deleted successfully {string}")
    public void verifyThatNewAddedUserIsDeletedSuccessfully(String email) {
        employeer.deleteCheckViaEmail(email);
    }

    @Then("Verify that new added user is deleted {string}")
    public void verifyThatNewAddedUserIsDeleted(String name) {
        employeer.deleteCheckViaSearchBox(name);
    }

   @When("User click Employee List")
    public void userClickEmployeeList() {
       firstPage.employeeListButton.click();
    }


}
