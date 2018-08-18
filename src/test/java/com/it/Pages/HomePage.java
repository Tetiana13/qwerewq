package com.it.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {


    @FindBy(xpath = "//ul[@class='sn_menu']/li[1]")
    private WebElement labelUserEmail;

    public String getLabelUserEmail() throws InterruptedException {

        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOf(labelUserEmail));
            driver.scrollDown();
            Thread.sleep(1000);
            driver.scrollUp();
        return labelUserEmail.getText();

    }
/*

    @FindBy(xpath = "//li[@class='sn_menu_item '][1]")
    public WebElement linkCreateMessage;
*/

}
