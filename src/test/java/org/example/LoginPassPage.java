package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPassPage {

    public WebDriver driver;

    public LoginPassPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/div/div/form/input[1]")
    private WebElement loginField;
    @FindBy(xpath = "/html/body/div/div/form/input[2]")
    private WebElement passwdField;
    @FindBy(xpath = "/html/body/div/div/form/button")
    private WebElement loginBtn;
    @FindBy(xpath = "/html/body/form/ol/li[3]/input")
    private WebElement radioBtn;
    @FindBy(xpath = "/html/body/form/input")
    private WebElement sendBtn;

    public void inputLogin(String login) {

        loginField.sendKeys(login);
    }

    public void inputPasswd(String passwd) {

        passwdField.sendKeys(passwd);
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }

    public void clickRadioBtn() {

        radioBtn.click();
    }

    public void clickSendBtn() {
        sendBtn.click();
    }
}
