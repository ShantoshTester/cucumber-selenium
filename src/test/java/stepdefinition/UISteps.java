package stepdefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

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
}
