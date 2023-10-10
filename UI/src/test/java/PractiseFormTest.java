import com.digital.models.Student;
import org.testng.annotations.Test;

public class PractiseFormTest extends BaseTest{

    @Test

    void fillUpTheFormTest() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        Student student = fakeDataProvider.createFakeStudent();
        practiseFormPage.fillUpTheForm(student);
               // .checkTheStudentDetails(student);
    }
}
