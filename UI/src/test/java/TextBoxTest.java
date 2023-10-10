import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {

    @Test
    void fillUpTheFormsTest() {

        driver.get("https://demoqa.com/text-box");
        textBoxPage
                .fillUpTheFullName("John")
                .fillUpEmail("agent007@gamil.com")
                .currentAddress("London")
                .permanentAddress("Bishkek")
                .submitBtnClick().testTexBoxForm();


    }
}
