package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.FirstPage;

public class FirstPageStepDefinitions {

    FirstPage fp = new FirstPage();

    @Given("User goes to Employee Page")
    public void user_goes_to_employee_page() {
        fp.navigateToEmployeeList();
    }
}
