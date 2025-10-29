package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class LoginSteps {

    WebDriver driver;

    @Before
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }

    @Given("I navigate to {string}")
    public void i_navigate_to(String url) {
        driver.get(url);
    }

    @Then("I should see the error message {string}")
    public void i_should_see_the_error_message(String errorMessage) {
        String actualErrorMessage = driver.findElement(By.xpath("//h3[contains(text(),'locked out')]")).getText();
        System.out.println("actual error message: " + actualErrorMessage);
        System.out.println("expected error message: " + errorMessage);
    }

    @When("I am on the login-page of the application")
    public void i_am_on_the_login_page_of_the_application() {
        String loginPageText = driver.findElement(By.xpath("//div[@class='login_logo']")).getText();
        System.out.println("Login Page Text: " + loginPageText);
    }

    @Then("I enter {string} as username")
    public void i_enter_as_username(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @Then("I enter {string} as password")
    public void i_enter_as_password(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @Then("I click on login button")
    public void i_click_on_login_button() {
        driver.findElement(By.id("login-button")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("I should see the home-page of the application")
    public void i_should_see_the_home_page_of_the_application() {
        String homePageText = driver.findElement(By.xpath("//span[@class='title']")).getText();
        System.out.println("HomePage Text: " + homePageText);
    }
}
