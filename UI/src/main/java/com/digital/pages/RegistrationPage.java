package com.digital.pages;

import com.digital.driver.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




public class RegistrationPage extends BasePage {
    @FindBy(id = "newUser")
    public WebElement newUserClick;
    @FindBy(id = "firstname")
    public WebElement firstNameInput;
    @FindBy(id = "lastname")
    public WebElement lastNameInput;
    @FindBy(id = "userName")
    public WebElement userNameInput;
    @FindBy(id = "password")
    public WebElement passwordInput;
    @FindBy(css = "div.recaptcha-checkbox-checkmark")
    public WebElement recaptchaAnchorClick;
    @FindBy(id = "submit-button-id")
    public WebElement submitBtn;
    Driver driver;

    public RegistrationPage fillUpFirstName(String txt) {
        elementActions.writeText(firstNameInput, txt);
        return this;

    }

    public RegistrationPage fillUpLastName(String txt) {
        elementActions.writeText(lastNameInput, txt);
        return this;
    }

    public RegistrationPage createUserName(String txt) {
        elementActions.writeText(userNameInput, txt);
        return this;
    }

    public RegistrationPage createPassword(String txt) {
        elementActions.writeText(passwordInput, txt);
        return this;
    }

    public RegistrationPage clickSubmitBtn() {
        submitBtn.click();
        return this;

    }
}