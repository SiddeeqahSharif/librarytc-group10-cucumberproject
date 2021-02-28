package com.cybertek.library.utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {

    public static List<String> getStringFromWebElements(List<WebElement> elements){

        List<String> stringList = new ArrayList<>();
        for (WebElement each : elements){
            stringList.add(each.getText());
        }
        return stringList;
    }
}
