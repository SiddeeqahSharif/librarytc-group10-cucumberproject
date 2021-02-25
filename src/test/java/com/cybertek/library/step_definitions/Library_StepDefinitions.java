package com.cybertek.library.step_definitions;

import com.cybertek.library.page.LoginPage;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Library_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("librarian is on the login page")
    public void librarian_is_on_the_login_page() {
        String url = ConfigurationReader.getProperty("Url");
        Driver.getDriver().get(url);
    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
       loginPage.inputUsername.sendKeys("student48@library");
    }

    @And("user enters librarian password")
    public void user_enters_librarian_password() {
        loginPage.inputPassword.sendKeys("xjapSRzD");

    }

    @And("user clicks the login button")
    public void userClicksTheLoginButton() {
        loginPage.loginButton.click();
    }

    @Then("librarian should see dashboard")
    public void librarian_should_see_dashboard() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Library";

        Assert.assertTrue(actualTitle.contains(expectedTitle));

        System.out.println(actualTitle);

    }


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        String url = ConfigurationReader.getProperty("Url");
        Driver.getDriver().get(url);
    }


    @When("user enters student username")
    public void userEntersStudentUsername() {
        loginPage.inputUsername.sendKeys("librarian48@library");

    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
        loginPage.inputPassword.sendKeys("LB8QnOmU");
    }

  //  @Then("student should see dashboard")
    //public void student_should_see_dashboard() {

    //}
}
