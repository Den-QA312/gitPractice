package com.digital.pages;

import com.digital.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicPropertiesPage extends BasePage {

    @FindBy(id = "enableAfter")
    public WebElement enableAfter;
    @FindBy(xpath = "//button[@id='colorChange']")
    public WebElement colorChange;
    @FindBy(id = "visibleAfter")
    public WebElement visibleAfter;

    public DynamicPropertiesPage clickWillEnableFiveSeconds() {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(6))
                .until((ExpectedConditions.elementToBeClickable(By.id("enableAfter"))))
                .click();
        return this;
    }

    public DynamicPropertiesPage setVisibleA() {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(8))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")))
                .click();
        return this;
    }

    public DynamicPropertiesPage changeColorYellow(){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='colorChange']")));
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].style.backgroundColor = 'yellow';", colorChange);

        return this;
    }
}
