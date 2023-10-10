package com.digital.driver;
import com.digital.config.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {

    private Driver() {
        // Singleton pattern
        //Singleton - это паттерн проектирования в программировании, который обеспечивает, что у класса есть только
        // один экземпляр, и предоставляет глобальную точку доступа к этому экземпляру. Суть Singleton заключается в
        // том, чтобы гарантировать, что для определенного класса будет создан только один объект, даже если попытки
        // создать его произойдут из разных частей программы.

    }
    private static WebDriver driver;
    public  static WebDriver getDriver(){
        if (driver == null){
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                case "chrome":
                    driver = ChromeWebDriver.loadFromWebdriver();
                    break;
                case "fox":
                    driver = FirefoxWebDriver.loadFireFoxWebdriver();
                    break;
                case  "edge":
                    driver = EdgeWebDriver.loadEdgeDriver();
                    break;
                default:
                    throw  new IllegalArgumentException("You provided another");

            }
        }
        return driver;
    }


    public static void closeDriver(){
        try {
            if (driver!=null){
                driver.close();
                driver.quit();
                driver=null;
            }
        }catch (Exception e){
            System.err.println("Error");
        }
    }
}
