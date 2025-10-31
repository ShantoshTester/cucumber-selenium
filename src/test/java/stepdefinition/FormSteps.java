package stepdefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static stepdefinition.LoginSteps.driver;

public class FormSteps  {

    @And("I enter first name as {string} and last name as {string}")
    public void i_enter_first_name_as_and_last_name_as(String firstName, String lastName) {
        driver.findElement(By.id("firstName")).sendKeys(firstName);
        driver.findElement(By.id("lastName")).sendKeys(lastName);
    }

    @Given("I select male as my gender")
    public void i_select_male_as_my_gender() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scroll(0,400)");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//label[text()='Male']")).click();
    }

    @Given("I enter my mobile number as {string}")
    public void i_enter_my_mobile_number_as(String mobileNumber) {
        driver.findElement(By.id("userNumber")).sendKeys(mobileNumber);
    }

    @Given("I select date of birth from calender")
    public void i_select_date_of_birth_from_calender() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='react-datepicker__input-container']")).click();
        Thread.sleep(2000);
        new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")))
                .selectByVisibleText("June");
        new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")))
                .selectByVisibleText("2000");
        driver.findElement(By.xpath("//div[text()='14']")).click();
    }

    @Given("I enter the subject as {string}")
    public void i_enter_the_subject_as(String subject) {
        driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys(subject);
    }

    @Given("I select music as my hobbies")
    public void i_select_music_as_my_hobbies() {
        System.out.println("to implement");
    }

    @Given("I choose to upload my pic")
    public void i_choose_to_upload_my_pic() {
        System.out.println("to implement");
    }

    @Given("I select state as {string}")
    public void i_select_state_as(String string) {
        System.out.println("to implement");
    }

    @Given("I select the city as {string}")
    public void i_select_the_city_as(String string) {
        System.out.println("to implement");
    }

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

    @And("I click on submit button in form filling")
    public void iClickOnSubmitButtonInFormFilling() {

    }
}
