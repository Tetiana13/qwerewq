package com.it.Pages;

import com.it.drivers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected static WebDriver driver = DriverFactory.getDriver();



    // конструктор базовой сраницы
    public BasePage() {
        PageFactory.initElements(driver, this);
    }

}
