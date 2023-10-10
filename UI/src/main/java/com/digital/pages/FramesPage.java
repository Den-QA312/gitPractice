package com.digital.pages;
import com.digital.driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FramesPage extends BasePage {
    @FindBy(id = "frame1")
    public WebElement frame1;
    @FindBy(id = "frame2")
    public WebElement childIframe;

    @FindBy(id = "sampleHeading")
    public WebElement text1;
    @FindBy(tagName = "h1")
    public WebElement text2;

    public FramesPage switchToFrame() {
        Driver.getDriver().switchTo().frame(frame1);
        Assert.assertTrue(text1.getText().contains("This is a sample page"));
        Driver.getDriver().switchTo().defaultContent();
        return this;
    }

    public FramesPage switchToFrame1() {
        Driver.getDriver().switchTo().frame(childIframe);
        Assert.assertTrue(text2.getText().contains("This is a sample page"));
        Driver.getDriver().switchTo().defaultContent();
        return this;
    }

}