import org.testng.annotations.Test;

public class ButtonPageTest extends BaseTest{
    @Test
    public void test() {
        driver.get("https://demoqa.com/buttons");
        buttonPage.clickDoubleBtn().clickRightBtn().clickMe();

    }

}
