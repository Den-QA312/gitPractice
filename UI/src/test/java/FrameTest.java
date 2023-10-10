import org.testng.annotations.Test;

public class FrameTest extends BaseTest{
@Test
    void Frame (){
    driver.get("https://demoqa.com/frames");
    framesPage.switchToFrame().switchToFrame1();
}
}
