package com.it.Pages;


        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;


public class MessagePage {

    @FindBy(xpath = "//textarea[@name='to']")
    private WebElement inputToUser;

    @FindBy(xpath = "//input [@name='subject']")
    private WebElement inputSubject;

    @FindBy(xpath = "//textarea [@name='body']")
    private WebElement inputTextMessageArea;

    @FindBy(xpath = "//input[@type='submit'][ @tabindex='12']")
    private WebElement sendMessageButton;


    public void newMessage(String to, String address, String textMes) {
        inputToUser.sendKeys(to);
        inputSubject.sendKeys(address);
        inputTextMessageArea.sendKeys(textMes);
        sendMessageButton.click();
    }

}

