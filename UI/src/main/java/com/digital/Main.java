package com.digital;

import com.digital.driver.Driver;
import com.digital.helper.AlertHelper;
import com.digital.helper.FrameHelper;
import com.digital.helper.ScreenShotMethods;
import com.digital.models.Student;
import com.digital.pages.PractiseFormPage;
import com.digital.pages.TextBoxPage;
import com.digital.utils.FakeDataProvider;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class Main {

//    public static void main(String[] args) {
//        Student john = new Student("John", "Doe", "john@mail.ru", "+996550358875","Bishkek");


    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = Driver.getDriver();
    }

    @Test
    void test() {
        driver.get("https://demoqa.com/text-box/");
        TextBoxPage textBoxPage = new TextBoxPage();
        textBoxPage
                .fillUpTheFullName("John")
                .fillUpEmail("agent007@gamil.com")
                .currentAddress("London")
                .permanentAddress("Bishkek")
                .submitBtnClick().testTexBoxForm();
       }

    @Test
    void test2() {
        driver.get("https://demoqa.com/automation-practice-form");
        FakeDataProvider fakeDataProvider = new FakeDataProvider();
        //Student student = new Student();
        PractiseFormPage practiseFormPage = new PractiseFormPage(driver);
        practiseFormPage.fillUpFirstName(fakeDataProvider.generateFakerName());
        practiseFormPage.fillUpLastName(fakeDataProvider.generateLastName());
        practiseFormPage.fillUpEmail(fakeDataProvider.generateFakeEmail());
        practiseFormPage.fillUpPhoneNumber(fakeDataProvider.generateFakePhoneNumber());
        practiseFormPage.fillUpCurrentAddress(fakeDataProvider.generateFakeCurrentAddress());


        practiseFormPage
                .randomGenderClick()
                .fillSubject()
                .hobbiesCheck()
                .uploadPictureInput()
                .selectState()
                .clickSubmitBtn();

    }

    @Test
    void test3() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        driver.findElement(By.id("timerAlertButton")).click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
        driver.findElement(By.id("confirmButton")).click();
        alert.dismiss();
        driver.findElement(By.id("promtButton")).click();
        alert.sendKeys("Denis");


    }

    @Test
    public void TestToAlert() throws InterruptedException, IOException {
        WebDriver driver1 = Driver.getDriver();
        AlertHelper alertHelper = new AlertHelper();
        ScreenShotMethods screenShotMethods = new ScreenShotMethods();
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(5000);
        alertHelper.acceptAlert();
        driver.findElement(By.id("timerAlertButton")).click();
        alertHelper.acceptAlert();
        Thread.sleep(2000);
        driver.findElement(By.id("confirmButton")).click();
        alertHelper.dismissAlert();
        driver.findElement(By.id("promtButton")).click();
        alertHelper.sendKeysAlert("Denis");
        screenShotMethods.takeScreenShot();
    }

    @Test
    void test12() {
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame1");
        WebElement text = driver.findElement(By.tagName("h1"));
        System.out.println(text.getText());
        driver.switchTo().defaultContent();
        WebElement div = driver.findElement(By.xpath("//div[@id='framesWrapper']/div"));
        System.out.println(div.getText());
    }

    @Test
    void test11() {
        driver.get("https://demoqa.com/nestedframes");
        // first go to parent frame
        driver.switchTo().frame("frame1");
        // then to child frame
        driver.switchTo().frame(0);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.switchTo().defaultContent();

    }

    @Test
    void test10(){
        driver.get("https://demoqa.com/frames");
        FrameHelper frameHelper = new FrameHelper(driver);
        frameHelper.switchToFrame("frame1");
        WebElement text = driver.findElement(By.tagName("h1"));
        System.out.println(text.getText());
        frameHelper.switchToDefaultContent();
        WebElement div  = driver.findElement(By.xpath("//div[@id='framesWrapper']/div"));
        System.out.println(div.getText());
    }

    @Test
    void test9(){
        driver.get("https://demoqa.com/nestedframes");
        FrameHelper frameHelper = new FrameHelper(driver);
        frameHelper.switchToFrame("frame1");
        frameHelper.switchToFrame(0);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        frameHelper.switchToParentFrame();
        System.out.println(driver.findElement(By.tagName("body")).getText());
        frameHelper.switchToDefaultContent();

    }
}