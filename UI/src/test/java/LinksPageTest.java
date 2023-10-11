import org.testng.annotations.Test;

public class LinksPageTest extends BaseTest{
    @Test
    public void linksTest(){
        driver.get("https://demoqa.com/links");
        linksPage.homeClick().
                home2Click().
                createdClick().
                noContentClick().
                movedClick().
                badRequestClick().
                unauthorizedClick().forbiddenClick().notFoundClick();


    }
}
