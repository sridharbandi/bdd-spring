package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class SearchResultsPage extends PageObject{

    @FindBy(partialLinkText = "Selenium")
    public WebElement lnkSelenium;

}
