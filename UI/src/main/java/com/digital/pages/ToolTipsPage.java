package com.digital.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ToolTipsPage extends BasePage {

    @FindBy(id = "toolTipButton")
    public WebElement hoverBtn;

    @FindBy(id = "toolTipTextField")
    public WebElement hoverTextField;


    @FindBy(xpath = "//div[@id='texToolTopContainer']/a")
    public WebElement hoverLink;

    public ToolTipsPage checkHoverBtn() {
        elementActions.clickTheButton(hoverBtn);
        boolean hasHover = elementActions.checkHoverEffect(hoverBtn, "box-shadow");
        Assert.assertTrue(hasHover);
        return this;
    }

    public ToolTipsPage checkHoverTextField() {
        elementActions.clickTheButton(hoverTextField);
        boolean hasHover = elementActions.checkHoverEffect(hoverTextField, "box-shadow");
        Assert.assertTrue(hasHover);
        return this;
    }

    public ToolTipsPage checkHoverLink() {
        boolean hasHover = elementActions.checkHoverEffect(hoverLink, "color");
        Assert.assertTrue(hasHover);
        return this;
    }
}