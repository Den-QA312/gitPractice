import com.digital.driver.Driver;
import com.digital.pages.*;
import com.digital.utils.FakeDataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {

    public WebDriver driver;

    public TextBoxPage textBoxPage;
    public PractiseFormPage practiseFormPage;
    public FakeDataProvider fakeDataProvider;
    public RegistrationPage registrationPage;
    public RadioButtonPage radioButtonPage;
    public ButtonPage buttonPage;
    public ToolTipsPage toolTipsPage;
    public DynamicPropertiesPage dynamicPropertiesPage;
    public AlertPage alertPage;
    public FramesPage framesPage;
    public WebTablesPage webTables;
    public  LinksPage linksPage;
    public BrokenLinksPage brokenLinksPage;





    @BeforeClass(alwaysRun = true)
    public void setUpBrowser() {
        driver = Driver.getDriver();
        textBoxPage = new TextBoxPage();
        practiseFormPage = new PractiseFormPage();
        fakeDataProvider = new FakeDataProvider();
        registrationPage = new RegistrationPage();
        radioButtonPage = new RadioButtonPage();
        toolTipsPage = new ToolTipsPage();
        buttonPage = new ButtonPage();
        dynamicPropertiesPage = new DynamicPropertiesPage();
        alertPage = new AlertPage();
        framesPage = new FramesPage();
        webTables = new WebTablesPage();
        linksPage = new LinksPage();
        brokenLinksPage = new BrokenLinksPage();


    }
//    @AfterClass(alwaysRun = true)
//    public void tearDown(){
//        Driver.closeDriver();
//    }
}
