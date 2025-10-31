package stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static stepdefinition.LoginSteps.driver;

public class UISteps {

    @When("I click on create new account button")
    public void i_click_on_create_new_account_button() {
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
    }

    @Then("I should see create new account page is displayed")
    public void i_should_see_create_new_account_page_is_displayed() {
        String createPage = driver.findElement(By.xpath("//div[text()='Create a new account']")).getText();
        Assert.assertTrue(createPage.contains("new account"));
    }

    @Then("I select day as {int}")
    public void i_select_day_as(Integer day) {
        new Select(driver.findElement(By.id("day"))).selectByVisibleText(String.valueOf(day));
    }

    @Then("I select month as {string}")
    public void i_select_month_as(String month) {
        new Select(driver.findElement(By.id("month"))).selectByVisibleText(month);
    }

    @Then("I select year as {int}")
    public void i_select_year_as(Integer year) {
        new Select(driver.findElement(By.id("year"))).selectByVisibleText(String.valueOf(year));
    }

    @When("I click on register link")
    public void iClickOnRegisterLink() {
        driver.findElement(By.linkText("Register")).click();
    }

    @Then("I enter the details into the registration form")
    public void i_enter_the_details_into_the_registration_form(DataTable dataTable) throws InterruptedException {
        List<List<String>> registrationData = dataTable.asLists(String.class);
        for(List<String> data : registrationData) {
            String firstName = data.get(0);
            String lastName = data.get(1);
            String email = data.get(2);
            System.out.println(firstName + " " + lastName + " " + email);
            WebElement fn = driver.findElement(By.id("FirstName"));
            WebElement ln = driver.findElement(By.id("LastName"));
            WebElement em = driver.findElement(By.id("Email"));

            fn.clear();
            fn.sendKeys(firstName);

            ln.clear();
            ln.sendKeys(lastName);

            em.clear();
            em.sendKeys(email);
            Thread.sleep(2000);
        }
    }

}
