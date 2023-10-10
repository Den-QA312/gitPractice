import com.digital.models.Student;
import org.testng.annotations.Test;

public class WebTablesTest extends BaseTest{
    @Test
   public void WebTables () throws InterruptedException {
        driver.get("https://demoqa.com/webtables");
        Student student = fakeDataProvider.createFakeStudent();
        webTables.addBtnClick();
        webTables.fillUpTheForm(student);
        Thread.sleep(5000);

    }

}

