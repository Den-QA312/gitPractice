package com.digital.pages;
import com.digital.models.Student;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import java.util.*;

public class PractiseFormPage extends BasePage {
    WebDriver driver;
    @FindBy(id = "firstName")
    public WebElement firstNameInput;

    @FindBy(id = "lastName")
    public WebElement lastNameInput;

    @FindBy(id = "userEmail")
    public WebElement userEmailInput;

    @FindBy(xpath = "//div[contains(@class, 'custom-radio')]//label[@class='custom-control-label']")
    public List<WebElement> radioGenderButtons;


    @FindBy(id = "userNumber")
    public WebElement userNumberInput;

    @FindBy(id = "dateOfBirthInput")
    public WebElement userDateOfBirthInput;

    @FindBy(id = "subjectsInput")
    public WebElement userSubjectInput;

    @FindBy(xpath = "//div[@id='hobbiesWrapper']//label[@class='custom-control-label']")
    public List<WebElement> hobbiesCheckboxList;

    @FindBy(id = "uploadPicture")
    public WebElement uploadPhotoFrom;

    @FindBy(id = "currentAddress")
    public WebElement userCurrentAddressInput;

    @FindBy(xpath = "//div[@id='state']//div[@aria-hidden='true']")
    public WebElement inputOpenState;
    @FindBy(id = "react-select-3-input")
    public WebElement inputForSetText;
    @FindBy(id = "react-select-4-input")
    public WebElement inputForSetCity;
    @FindBy(xpath = "//div[@id='state']//div[2]")
    public List<WebElement> containerForStateTexts;

    @FindBy(id = "submit")
    public WebElement submitBtn;

    @FindBy (xpath = "//td[text()='Student Name']/../td[2]")
    public WebElement expectedName;
    @FindBy(xpath = "//td[text()='Student Email']/../td[2]")
    public WebElement expectedEmail;
    @FindBy(xpath = "//td[text()='Gender']/../td[2]")
    public WebElement expectedGender;
    @FindBy(xpath = "//td[text()='Mobile']/../td[2]")
    public WebElement expectedMobilePhone;
    @FindBy(xpath = "//td[text()='Date of Birth']/../td[2]")
    public WebElement expectedDate;
    @FindBy(xpath = "//td[text()='Subjects']/../td[2]")
    public WebElement expectedSubjects;
    @FindBy(xpath = "//td[text()='Hobbies']/../td[2]")
    public WebElement expectedHobbies;
    @FindBy(xpath = "//td[text()='Picture']/../td[2]")
    public WebElement expectedPicture;
    @FindBy(xpath = "//td[text()='Address']/../td[2]")
    public WebElement expectedAddress;
    @FindBy(xpath = "//td[text()='State and City']/../td[2]")
    public WebElement expectedStateAndCity;

    public PractiseFormPage(WebDriver driver) {

        this.driver = driver;
    }

    public PractiseFormPage() {

    }


    public PractiseFormPage hobbiesCheck() {
        elementActions.clickToRandomElement(hobbiesCheckboxList);

        return this;
    }
    public PractiseFormPage fillUpFirstName(String txt) {
        elementActions.writeText(firstNameInput, txt);
        return this;
    }
    public PractiseFormPage fillUpLastName(String txt) {
        elementActions.writeText(lastNameInput, txt);
        return this;
    }
    public PractiseFormPage fillUpEmail(String txt) {
        elementActions.writeText(userEmailInput, txt);
        return this;
    }
    public PractiseFormPage randomGenderClick() {
    elementActions.clickToRandomElement(radioGenderButtons);
        return this;
    }
    public PractiseFormPage fillUpPhoneNumber(String txt) {
        elementActions.writeText(userNumberInput, txt);
        return this;
    }

    public PractiseFormPage fillSubject() {
       elementActions.clickTheButton(userSubjectInput);
        List<String> subjectsList = new ArrayList<>();
        subjectsList.add("Accounting");
        subjectsList.add("Arts");
        subjectsList.add("Maths");
        subjectsList.add("Social Studies");
        subjectsList.add("Biology");
        subjectsList.add("Chemistry");
        subjectsList.add("Computer Science");
        subjectsList.add("Commerce");
        subjectsList.add("Hindi");
        subjectsList.add("English");
        subjectsList.add("Physics");
        subjectsList.add("Economics");
        subjectsList.add("History");

        Random random = new Random();

        String randomSubject = subjectsList.get(random.nextInt(subjectsList.size()));
        elementActions.writeText(userSubjectInput, randomSubject);
        elementActions.writeText(userSubjectInput, "" + Keys.ENTER);
        return this;
    }
    public PractiseFormPage fillUpCurrentAddress(String txt) {
        elementActions.writeText(userCurrentAddressInput, txt);
        return this;
    }

    public PractiseFormPage uploadPictureInput() {
        elementActions.writeText(uploadPhotoFrom, "C:\\Users\\Денис\\Desktop\\IMG-20160830-WA0027.jpg");
        return this;
    }
    public PractiseFormPage clickSubmitBtn() {
        elementActions.scrollToTheElements(submitBtn);
       elementActions.clickTheButton(submitBtn);
        return this;
    }
    public PractiseFormPage selectState() {
        elementActions.scrollToTheElements(inputOpenState);
        elementActions.clickTheButton(inputOpenState);
        Map<String, String[]> stateAndCityList = new HashMap<>();
        stateAndCityList.put("NCR", new String[]{"Delhi", "Gurgaon", "Noida"});
        stateAndCityList.put("Uttar Pradesh", new String[]{"Agra", "Lucknow", "Merrut"});
        stateAndCityList.put("Haryana", new String[]{"Karnal", "Panipat"});
        stateAndCityList.put("Rajastan", new String[]{"Jaipur", "Jaiselmer"});

        Random random = new Random();
        List<String> keyList = new ArrayList<>(stateAndCityList.keySet());
        String randomKey = keyList.get(random.nextInt(keyList.size()));
        String[] randomCities = stateAndCityList.get(randomKey);
        String randomCity = randomCities[random.nextInt(randomCities.length)];
        elementActions.scrollToTheElements(inputForSetText);
        elementActions.scrollToTheElements(inputForSetCity);
        elementActions.setTextAndClickElement(randomKey, inputForSetText);
        elementActions.setTextAndClickElement(randomCity, inputForSetCity);
        return this;

    }

    public PractiseFormPage fillUpTheForm(Student student){
        fillUpFirstName(student.getFirstName())
                .fillUpLastName(student.getLastName())
                .fillUpPhoneNumber(student.getPhoneNumber())
                .fillUpEmail(student.getEmail())
                .fillUpCurrentAddress(student.getCurrentAddress())
                .hobbiesCheck()
                .randomGenderClick()
                .fillSubject()
                .selectState()
                .clickSubmitBtn();
        return this;
    }
//    public PractiseFormPage checkTheStudentDetails (Student student) throws InterruptedException {
//
//        System.out.println(expectedName.getText());
//        Thread.sleep(2000);
//        Assert.assertTrue(expectedName.getText().contains(student.getFirstName()));
//        Assert.assertTrue(expectedName.getText().contains(student.getLastName()));
//        Assert.assertTrue(expectedEmail.getText().contains(student.getEmail()));
//        Assert.assertTrue(expectedAddress.getText().contains(student.getCurrentAddress()));
//        System.out.println();
//        Assert.assertTrue(expectedMobilePhone.getText().contains(student.getPhoneNumber()));
//        return this;
//    }
}
