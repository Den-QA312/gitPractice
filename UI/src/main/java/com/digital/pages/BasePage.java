package com.digital.pages;

import com.digital.driver.Driver;
import com.digital.helper.ElementActions;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    } // constructor

    ElementActions elementActions = new ElementActions(); //Создается переменная экземпляра с именем elementActions типа
    // ElementActions и инициализируется новым экземпляром класса ElementActions. Это указывает на то, что
    // ElementActions - это вспомогательный класс или утилита для выполнения действий с элементами страницы.
}