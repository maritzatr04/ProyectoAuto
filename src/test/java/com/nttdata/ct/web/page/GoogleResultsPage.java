package com.nttdata.ct.web.page;

import com.nttdata.ct.web.base.WebBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleResultsPage extends WebBase {

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p/span")
    protected WebElement resultsLabel;

    public String getSearchResults() {
        return getText(resultsLabel);
    }

}