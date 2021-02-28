package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class BooksPage {

    public BooksPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//select[@class='form-control input-sm input-xsmall input-inline']/option[text()='10']")
    public WebElement recordNumber;

    @FindBy(xpath ="//select[@class='form-control input-sm input-xsmall input-inline']" )
    public WebElement dropDownCount;


    @FindBy(xpath = "//select[@name='tbl_books_length']/option")
    public List<WebElement> dropdownNumbers;

    List<WebElement> expectedList = new ArrayList<>();
}
