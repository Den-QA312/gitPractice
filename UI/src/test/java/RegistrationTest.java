
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest{

    @Test
    void fillRegistrationTest (){
        driver.get("https://demoqa.com/register");
        registrationPage
                .fillUpFirstName("Greg")
                .fillUpLastName("Doe")
                .createUserName("King")
                .createPassword("A12345!z")
                .clickSubmitBtn();

    }
}
