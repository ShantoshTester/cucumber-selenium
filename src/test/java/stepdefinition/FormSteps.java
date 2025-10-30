package stepdefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static stepdefinition.LoginSteps.driver;

public class FormSteps  {

    @And("I enter full name as {string}")
    public void i_enter_full_name_as(String fullName) {
        driver.findElement(By.id("userName")).sendKeys(fullName);
    }

    @And("I enter email as {string}")
    public void i_enter_email_as(String email) {
        driver.findElement(By.id("userEmail")).sendKeys(email);
    }

    @And("I enter my current address as")
    public void i_enter_my_current_address_as(String currentAddress) {
        driver.findElement(By.id("currentAddress")).sendKeys(currentAddress);
    }

    @And("I enter the permanent address as")
    public void i_enter_the_permanent_address_as(String permanentAddress) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("permanentAddress")).sendKeys(permanentAddress);
    }

    @And("I click on submit button")
    public void i_click_on_submit_button() {
        driver.findElement(By.id("submit")).click();
    }

    @When("I click on home checkbox")
    public void iClickOnHomeCheckbox() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='rct-checkbox']")));
        driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
    }

    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String expectedMessage) {
        System.out.println(expectedMessage);
        String actualMessage = driver.findElement(By.xpath("//span[text()='You have selected :']")).getText();
    }
}
