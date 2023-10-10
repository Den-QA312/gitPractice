package com.digital.pages;
import com.digital.models.Student;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablesPage extends BasePage {

    @FindBy(id = "addNewRecordButton")
    public WebElement addNewUserBtn;
    @FindBy(id = "firstName")
    public WebElement firstNameInput;
    @FindBy(id = "lastName")
    public WebElement lastNameInput;
    @FindBy(id = "userEmail")
    public WebElement userEmailInput;
    @FindBy(id = "age")
    public WebElement ageInput;
    @FindBy(id = "salary")
    public WebElement salaryInput;
    @FindBy(id = "department")
    public WebElement departmentInput;
    @FindBy(id = "submit")
    public WebElement submitClick;


    public WebTablesPage addBtnClick() {
        elementActions.clickTheButton(addNewUserBtn);
        return this;
    }

    public WebTablesPage fillUpFirstName(String txt) {
        elementActions.writeText(firstNameInput, txt);
        return this;
    }

    public WebTablesPage fillUpLastName(String txt) {
        elementActions.writeText(lastNameInput, txt);
        return this;
    }

    public WebTablesPage fillUpEmail(String txt) {
        elementActions.writeText(userEmailInput, txt);
        return this;
    }

    public WebTablesPage fillUpAge(String txt) {
        elementActions.writeText(ageInput, txt);
        return this;
    }

    public WebTablesPage fillUpSalary(String txt) {
        elementActions.writeText(salaryInput, txt);
        return this;
    }

    public WebTablesPage fillUpDepartment (String txt) {
        elementActions.writeText(departmentInput, txt);
        return this;
    }

    public WebTablesPage clickSubmit() {
        elementActions.clickTheButton(submitClick);
        return this;
    }


    public WebTablesPage fillUpTheForm (Student student) {
        fillUpFirstName(student.getFirstName())
                .fillUpLastName(student.getLastName())
                .fillUpEmail(student.getEmail())
                .fillUpAge(student.getAge())
                .fillUpSalary(student.getSalary())
                .fillUpDepartment("Accounting")
                .clickSubmit();

        return this;
    }
}








