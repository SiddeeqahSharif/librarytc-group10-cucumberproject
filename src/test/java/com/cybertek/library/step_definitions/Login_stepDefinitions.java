package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LibraryLoginPage;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.CredentialReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_stepDefinitions {

    LibraryLoginPage libraryLoginPage = new LibraryLoginPage();

    @Given("User is on the library login page")
    public void user_is_on_the_library_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("Url"));
    }

    @When("User enters correct student {string} and {string}")
    public void userEntersCorrectStudentAnd(String arg1, String arg2){
        libraryLoginPage.inputUsername.sendKeys(CredentialReader.getProperty(arg1));
        libraryLoginPage.inputPassword.sendKeys(CredentialReader.getProperty(arg2));
    }

    @When("User enters correct librarian {string} and {string}")
    public void userEntersCorrectLibrarianAnd(String arg1, String arg2){
        libraryLoginPage.inputUsername.sendKeys(CredentialReader.getProperty(arg1));
        libraryLoginPage.inputPassword.sendKeys(CredentialReader.getProperty(arg2));
    }

    @When("User clicks the sign-in button")
    public void user_clicks_the_sign_in_button(){
        libraryLoginPage.loginButton.click();
    }

    @Then("User sees the library homepage")
    public void userSeesTheLibraryHomepage() {
        String expectedInTitle = "Library";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
        if ((actualTitle.contains(expectedInTitle))) {
            System.out.println("All users successfully logged in.");
        } else {
            System.out.println("Login unsuccessful.");
        }
    }


}
