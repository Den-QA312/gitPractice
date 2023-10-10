import org.testng.annotations.Test;

public class ToolTipsTest extends BaseTest{

    @Test
   public void test8(){
        driver.get("https://demoqa.com/tool-tips");
        toolTipsPage.
                checkHoverBtn().checkHoverTextField().checkHoverLink();

    }
}
