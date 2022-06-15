package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
    }
    @Given("the user is in the login page")
    public void the_user_is_in_the_login_page() {
        driver.get("https://s-beta.taringa.net/login");
    }
    @When("^the user enters username (.*)$")
    public void the_user_enters_a_username(String username) {
        WebElement userName = driver.findElement(By.name("id"));
        userName.sendKeys(username);
    }
    @When("^the user enters password (.*)$")
    public void the_user_enters_a_password(String pasword) {
        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys(pasword);
    }
    @Then("the user clicks login")
    public void the_user_clicks_login() {
        WebElement buttonLogin = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[5]/main/div[2]/section/form/div[2]/button"));
        buttonLogin.click();
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
