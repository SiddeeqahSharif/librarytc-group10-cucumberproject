package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LibraryUsersPage;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout_stepDefinitions {


    LibraryUsersPage libraryUsersPage = new LibraryUsersPage();

    @When("User click navigation bar dropdown")
    public void user_click_navigation_bar_dropdown() {
        libraryUsersPage.NavigationBarDropdown.click();

    }

    @When("Click Log Out")
    public void click_navigation_bar() {
        libraryUsersPage.LogoutButton.click();
    }

    @Then("User is back on login page")
    public void user_is_back_on_login_page() {
        String webTittle = Driver.getDriver().getTitle();
        if (webTittle.equals("Login - Library")) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");

        }
    }
}

