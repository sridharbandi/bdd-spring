package org.example.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GoogleSearchPage extends PageObject{

    @Value("${aut.url}")
    private String url;

    @FindBy(name = "q")
    WebElement searchBox;


    public void openURL(){
        driver.get(url);
    }

    public void searchFor(String searchTerm){
        searchBox.sendKeys(searchTerm + Keys.RETURN);
    }
}
