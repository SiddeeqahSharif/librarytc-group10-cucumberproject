package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.BooksPage;
import com.cybertek.library.pages.HomePage;
import com.cybertek.library.pages.LibraryLoginPage;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.CredentialReader;
import com.cybertek.library.utilities.Driver;
import com.cybertek.library.utilities.StringUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class BookRecords_stepDefinitions {

    LibraryLoginPage libraryLoginPage = new LibraryLoginPage();

    HomePage homePage = new HomePage();

    BooksPage booksPage = new BooksPage();


    @Then("User should see the dashboard")
    public void user_should_see_the_dashboard() {

    }

    @Then("User clicks on the Books module")
    public void user_clicks_on_the_books_module() {

        homePage.BooksModule.click();

    }

    @Then("User should see that the default number is {string}")
    public void userShouldSeeThatTheDefaultNumberIs(String string) {
        String actualNumber = booksPage.recordNumber.getText();
        Assert.assertEquals(string, actualNumber);

    }

    @Then("User should click on the Show records tab")
    public void user_should_click_on_the_show_records_tab() {
    booksPage.dropDownCount.click();
    }

    @Then("User should see the following numbers in the dropdown list")
    public void user_should_see_the_following_numbers_in_the_dropdown_list(List<String> count) {
    Assert.assertEquals(count, StringUtils.getStringFromWebElements(booksPage.dropdownNumbers));

    }


}
