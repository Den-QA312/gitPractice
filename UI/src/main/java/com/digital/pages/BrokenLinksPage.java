package com.digital.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class BrokenLinksPage extends BasePage {
    @FindBy(linkText = "Click Here for Valid Link")
    public WebElement clickForValidLink;
    @FindBy(linkText = "Click Here for Broken Link")
    public WebElement clickForBrokenLink;


    public BrokenLinksPage clickValidLink() {
        elementActions.clickWithJavaScript(clickForValidLink);
        Assert.assertNotNull(clickForValidLink, "Valid link element is not present");
        return this;
    }

    public BrokenLinksPage clickBrokenLink() {
        elementActions.clickWithJavaScript(clickForBrokenLink);
        Assert.assertNotNull(clickForBrokenLink,"Broken link element is not present");
        return this;
    }
}


