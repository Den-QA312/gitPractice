package com.digital.driver;
import com.digital.config.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;

public class FirefoxWebDriver {
    public static void main(String[] args) {

    }

    public static WebDriver loadFireFoxWebdriver() {

        //System.setProperty("web-driver.gecko.driver", "D:\\New Java\\SummerSDET23\\drivers\\geckodriver.exe");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
//        if (Boolean.parseBoolean(ConfigReader.getProperty("headless"))){
//            options.addArguments("--headless");
//        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }
}
