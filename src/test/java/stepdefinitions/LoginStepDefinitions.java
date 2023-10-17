package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.LoginPage;

public class LoginStepDefinitions {

    LoginPage lp = new LoginPage();

    @Given("User login with given credentials")
    public void user_login_with_given_credentials() {
        lp.fillTheUserNameAndPasswordBox();
        lp.clickSubmitButton();
    }
}
