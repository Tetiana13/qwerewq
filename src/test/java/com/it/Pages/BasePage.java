package com.it.Pages;

import com.it.drivers.MyDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected static MyDriver driver = (MyDriver) MyDriver.getDriver();



    // конструктор базовой сраницы
    public BasePage() {
        PageFactory.initElements(driver, this);
    }

}
