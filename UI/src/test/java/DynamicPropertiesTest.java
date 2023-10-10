import org.testng.annotations.Test;

public class DynamicPropertiesTest extends BaseTest{
    @Test
    public void DynamicProperties () {
        driver.get("https://demoqa.com/dynamic-properties");
        dynamicPropertiesPage.clickWillEnableFiveSeconds().changeColorYellow().setVisibleA();
    }
}
