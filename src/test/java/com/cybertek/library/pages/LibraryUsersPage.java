package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryUsersPage extends Library_BasePage{

    public LibraryUsersPage(){ PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(css = "[class='btn btn-lg btn-outline btn-primary btn-sm']")
    public WebElement AddUser;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement NewUserFullName;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement NewUserPassword;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement NewUserEmail;

    @FindBy(xpath = "//textarea[@id='address']")
    public WebElement NewUserAddress;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement SaveChangesButton;

    @FindBy(xpath = "//button[@class='btn default']")
    public WebElement CloseUserAddPopup;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement UserAddSuccessMessage;




}
