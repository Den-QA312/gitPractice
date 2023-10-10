package com.digital.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TextBoxPage extends BasePage {
    // Page Object Model

    @FindBy(id = "userName")
    public WebElement fullNameInput;
    @FindBy(id = "name")
    public WebElement expectedFullNameInput;


    @FindBy(id = "userEmail")
    public WebElement userEmailInput;
    @FindBy(id = "email")
    public WebElement expectedEmailInput;


    @FindBy(id = "currentAddress")
    public WebElement userCurrentAddress;
    @FindBy(xpath = "//p[@id='currentAddress']")
    public WebElement expectedCurrentAddress;


    @FindBy(id = "permanentAddress")
    public WebElement userPermanentAddress;
    @FindBy(xpath = "//p[@id='permanentAddress']")
    public WebElement expectedPermanentAddress;

    @FindBy(id = "submit")
    public WebElement submitClick;

    public TextBoxPage fillUpTheFullName(String fullName) {
        elementActions.writeText(fullNameInput, fullName);
        return this;

    }

    public TextBoxPage fillUpEmail(String email) {
        elementActions.writeText(userEmailInput, email);
        return this;
    }

    public TextBoxPage currentAddress(String currentAddress) {
        elementActions.writeText(userCurrentAddress, currentAddress);
        return this;
    }

    public TextBoxPage permanentAddress(String permanentAddressInput) {
        elementActions.writeText(userPermanentAddress, permanentAddressInput);
        return this;

    }

    public TextBoxPage submitBtnClick() {
        elementActions.waitButtonToBeClickable(submitClick)
                .scrollToTheElements(submitClick)
                .clickTheButton(submitClick);
        return this;
    }

    public TextBoxPage testTexBoxForm() {
        Assert.assertTrue(expectedFullNameInput.getText().contains(fullNameInput.getText()));
        Assert.assertTrue(expectedEmailInput.getText().contains(userEmailInput.getText()));
        Assert.assertTrue(expectedCurrentAddress.getText().contains(userCurrentAddress.getText()));
        Assert.assertTrue(expectedPermanentAddress.getText().contains(userPermanentAddress.getText()));
        return this;
    }
}

