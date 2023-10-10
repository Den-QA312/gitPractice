import org.testng.annotations.Test;

public class

AlertPageTest extends BaseTest{
    @Test
    public void AlertPage (){
        driver.get("https://demoqa.com/alerts");
        alertPage.clickAlertBtn().clickTAlertBtnAfterFiveSec().clickConfirmButton().testPromptBoxBtn();
    }
}
