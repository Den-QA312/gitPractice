package com.digital.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LinksPage extends BasePage {
    @FindBy(id = "simpleLink")
    public WebElement home;
    @FindBy(id = "dynamicLink")
    public WebElement home2lnm;
    @FindBy(id = "created")
    public WebElement created;
    @FindBy(id = "no-content")
    public WebElement noContent;
    @FindBy(id = "moved")
    public WebElement moved;
    @FindBy(id = "bad-request")
    public WebElement badRequest;
    @FindBy(id = "unauthorized")
    public WebElement unauthorized;
    @FindBy(id = "forbidden")
    public WebElement forbidden;
    @FindBy(id = "invalid-url")
    public WebElement notFound;

    public LinksPage homeClick() {
        elementActions.clickTheButton(home);
        return this;
    }

    public LinksPage home2Click() {
        elementActions.clickTheButton(home2lnm);
        return this;
    }

    public LinksPage createdClick() {
        elementActions.clickTheButton(created);
        String statusTextAfterClick = linksPage.created.getText();
        String expectedText = "Link has responded with staus 201 and status text Created";
        Assert.assertEquals();
        return this;
    }

    public LinksPage noContentClick() {
        elementActions.clickTheButton(noContent);
        return this;
    }
    public LinksPage movedClick() {
        elementActions.clickTheButton(moved);
        return this;
    }
    public LinksPage badRequestClick() {
        elementActions.clickTheButton(badRequest);
        return this;
    }
    public LinksPage unauthorizedClick() {
        elementActions.clickWithJavaScript(unauthorized);
        return this;

    }
    public LinksPage forbiddenClick() {
        elementActions.clickWithJavaScript(forbidden);
        return this;
    }
    public LinksPage notFoundClick() {
        elementActions.clickWithJavaScript(notFound);
        return this;
    }
}