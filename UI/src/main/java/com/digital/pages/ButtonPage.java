package com.digital.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ButtonPage extends BasePage {
    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClickBtn;
    @FindBy(id = "rightClickBtn")
    public WebElement rightClickBtn;
    @FindBy(xpath = "//button[text()='Click Me']")
    public WebElement clickMe;

    @FindBy(id = "doubleClickMessage")
    public WebElement doubleClickText;
    @FindBy(id = "rightClickMessage")
    public WebElement rightClickText;
    @FindBy(id = "dynamicClickMessage")
    public WebElement dynamicClickMessage;

    public ButtonPage clickDoubleBtn() {
        elementActions.doubleClickBtn(doubleClickBtn);
        Assert.assertTrue(doubleClickText.getText().contains("You have done a double click"));
        return this;
    }

    public ButtonPage clickRightBtn() {
        elementActions.rightClickBtn(rightClickBtn);
        Assert.assertTrue(rightClickText.getText().contains("You have done a right click"));
        return this;
    }

    public ButtonPage clickMe() {
        elementActions.clickTheButton(clickMe);
        Assert.assertTrue(dynamicClickMessage.getText().contains("You have done a dynamic click"));
        return this;
    }
}