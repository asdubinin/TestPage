package org.example;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPassTest {

    public static LoginPassPage loginPage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\British Mate\\chromedriver\\chromedriver.exe");
        //создание экземпляра драйвера
        driver = new ChromeDriver();
        loginPage = new LoginPassPage(driver);
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //получение ссылки на страницу входа из файла настроек
        driver.get("http://u920152e.beget.tech/");
    }

    /**
     * critical pass test
     */
    @Test
    public void loginTest() {

        //вводим логин
        loginPage.inputLogin("login@mail.ru");
        //вводим пароль
        loginPage.inputPasswd("123456789");
        //нажимаем кнопку входа
        loginPage.clickLoginBtn();
        //нажимаем радио-батон
        loginPage.clickRadioBtn();
        //нажимаем кнопку отправить
        loginPage.clickSendBtn();
    }
}


