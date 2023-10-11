import org.testng.annotations.Test;

public class BrokenLinksTest extends BaseTest{
    @Test
    public void BrokenTest(){
        driver.get("https://demoqa.com/broken");
        brokenLinksPage.clickValidLink().clickBrokenLink();
    }
}
