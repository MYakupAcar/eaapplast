package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateUserPage;

public class CreateUserDefinitions {

    CreateUserPage user = new CreateUserPage();


    @When("User add {string}, {string}, {string}, {string}, {string}")
    public void user_add(String name, String salary, String workedDuration, String grade, String email) {
        user.addNewUser(name, salary, workedDuration,grade,email);
    }


    @Then("User see added emloyee with {string}, {string}, {string}, {string}, {string}")
    public void user_see_added_emloyee_with(String string, String string2, String string3, String string4, String email) {
        user.checkemail(email);
    }


    @When("user clicks create")
    public void user_clicks_create() {
        user.clickCreateNewUser();
    }


    @When("User clicks create button")
    public void user_clicks_create_button() {
        user.clickCreate();
    }
}

