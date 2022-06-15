package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BlockUserSteps {

    WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
    }
    @Given("user is in the login page")
    public void user_is_in_the_login_page() {
        driver.get("https://s-beta.taringa.net/login");
    }
    @When("user enters username and password")
    public void user_enters_username_and_password() {

    }
    @When("the user clicks login button")
    public void the_user_clicks_login_button() {

    }
    @Then("the user is navigated to the login page")
    public void the_user_is_navigated_to_the_login_page() {

    }
    @Given("the user is in the chat page")
    public void the_user_is_in_the_chat_page() {

    }
    @When("the user opens the davidlopez123")
    public void the_user_opens_the_davidlopez123() {

    }
    @When("selects block user")
    public void selects_block_user() {

    }
    @Then("the user is blocked")
    public void the_user_is_blocked() {

    }

    @After
    public void tearDown(){
        driver.close();
    }
}
