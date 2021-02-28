package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Library_BasePage {

    public Library_BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//i[@class='fa fa-book']")
    public WebElement Books;

        @FindBy(xpath = "//select[@id='book_categories']")
        public WebElement BookCategories;

        @FindBy(xpath = "//table[@id='tbl_books']//tr[1]/td[5]")
        public WebElement FirstRowCategory;

    @FindBy(xpath = "//i[@class='fa fa-book-reader']")
    public WebElement BorrowingBooks;

    @FindBy(xpath = "//a[@href='#dashboard']")
    public WebElement Dashboard;

    @FindBy(xpath = "//a[@href='#users']")
    public WebElement Users;

    @FindBy(id="user_groups")
    public WebElement UserGroup;

    @FindBy(id = "user_avatar")
    public WebElement userAvatar;

    @FindBy(xpath = "//a[contains(text(), 'Log Out')]")
    public WebElement LogOut;

    @FindBy(xpath="//th")
    public List<WebElement> tableHeaders;

}