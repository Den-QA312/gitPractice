package com.digital.models;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class BaseTest2 {

    WebDriver driver;
    @BeforeClass
    public void setUpBrowser()


    {
        System.setProperty("web-driver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

//    @AfterClass
//    public void tearDown()
//    {
//     driver.close();
//     driver.quit();
//    }
//
}

