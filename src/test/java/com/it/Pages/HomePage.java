package com.it.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    @FindBy(xpath = "//ul[@class='sn_menu']/li[1]")
    private WebElement labelUserEmail;

    public String getLabelUserEmail() {
        return labelUserEmail.getText();

    }
/*

    @FindBy(xpath = "//li[@class='sn_menu_item '][1]")
    public WebElement linkCreateMessage;
*/

}
