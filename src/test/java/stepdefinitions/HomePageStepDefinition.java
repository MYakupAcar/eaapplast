package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class HomePageStepDefinition {
    HomePage hp = new HomePage();


    @Given("User goes to home page")
    public void user_goes_to_home_page() {
        WebDriver driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("homePage"));
        hp.navigateToHomePage();
    }
}
