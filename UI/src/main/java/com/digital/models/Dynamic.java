package com.digital.models;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class Dynamic extends BaseTest2 {

    @FindBy(id = "enableAfter")
    public WebElement enableAfter;

    @FindBy(xpath = "//button[@id='colorChange']")
    public WebElement colorChange;

    @FindBy(id = "visibleAfter")
    public WebElement visibleAfter;


    @Test(priority = 1)
    public void clickclick() throws InterruptedException {
        driver.get("https://demoqa.com/dynamic-properties");
        new WebDriverWait(driver,Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")))
                .click();
        Thread.sleep(3000);
    }
    @Test(priority = 2)
    public void visibleAfter() throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(7))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")))
                .click();
        Thread.sleep(3000);
    }

//    @Test(priority = 3)
//    public void changeColorToRed() throws InterruptedException {
//        new WebDriverWait(driver,Duration.ofSeconds(15))
//                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='colorChange']")));
//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//        jsExecutor.executeScript("arguments[0].style.backgroundColor = 'red';", colorChange);
//
//        Thread.sleep(3000);


    @Test(priority = 3)
    public void changeColorToRed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Ожидаем видимости кнопки
        WebElement colorChangeButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='colorChange']")));

        // Выполняем JavaScript для изменения цвета
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].style.backgroundColor = 'red';", colorChangeButton);
    }

}


//    WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(7));
//
//    public Dynamic clickAfter5 (WebElement enableAfter) {
//        webDriverWait.until(ExpectedConditions.elementToBeClickable(enableAfter)).click();
//
//        return this;
//    }
//
//    public Dynamic clickVisible (WebElement visibleAfter){
//        webDriverWait.until(ExpectedConditions.visibilityOf(visibleAfter)).click();
//        return this;
//    }
//    public Dynamic openUrl()
//    {
//        driver.get("https://demoqa.com/dynamic-properties");
//        return this;
   // }

