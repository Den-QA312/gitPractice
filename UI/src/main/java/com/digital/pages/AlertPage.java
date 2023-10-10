package com.digital.pages;
import com.digital.helper.AlertHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AlertPage extends BasePage{
    AlertHelper alertHelper = new AlertHelper();
    @FindBy (id="alertButton")
    public WebElement alertButton;
    @FindBy(id= "timerAlertButton")
    public WebElement timerAlertButton;
    @FindBy(id= "confirmButton")
    public WebElement confirmButton;
    @FindBy(id="promtButton" )
    public WebElement promtButton;
    @FindBy(id= "confirmResult")
    public WebElement confirmResult;
    @FindBy(id= "promptResult")
    public WebElement promptResult;

    public AlertPage clickAlertBtn(){
        elementActions.clickTheButton(alertButton);
        alertHelper.acceptAlert();
        return this;
    }
    public AlertPage clickTAlertBtnAfterFiveSec(){
        elementActions.clickTheButton(timerAlertButton);
        alertHelper.acceptAlert();
        return this;
    }
    public AlertPage clickConfirmButton(){
        elementActions.clickTheButton(confirmButton);
        alertHelper.dismissAlert();
        Assert.assertTrue(confirmResult.getText().contains("Cancel"));
        return this;
    }
    public AlertPage testPromptBoxBtn(){
        elementActions.clickTheButton(promtButton);
        alertHelper.sendKeysAlert("Denis");
        Assert.assertTrue(promptResult.getText().contains("Denis"));
        return this;
    }
}