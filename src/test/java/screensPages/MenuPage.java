package screensPages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.xpath;

public class MenuPage extends AbstractPage {

    public MenuPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    private By menuBtn = xpath("//*[contains(@text, 'menu')]");
    private By checkFinesBtn = xpath("//*[contains(@text, 'Проверка штрафов')]");
    private By paidForNumberUinBtn = xpath("//*[contains(@text, 'Оплата по постановлению')]");
    private By historyPay = xpath("//*[contains(@text, 'История')]");
    private By driversAndCarsBtn = xpath("//*[contains(@text, 'Водители и ТС')]");
    private By bankCardBtn = xpath("//*[contains(@text, 'Банковская карта')]");
    private By helpBtn = xpath("//*[contains(@text, 'Помощь')]");
    private By juristBtn = xpath("//*[contains(@text, 'Консультация юриста')]");
    private By rateAppBtn = xpath("//*[contains(@text, 'Оценить приложение')]");
    private By shareBtn = xpath("//*[contains(@text, 'Поделиться')]");
    private By anotherAppBtn = xpath("//*[contains(@text, 'Другие приложения')]");


    public void waitBtnMenu() { //находим кнопку Меню
        waitElement(menuBtn, 90);
    }

    public void clickBtnMenu() { //находим кнопку Меню
        waitBtnMenu();
        clickButton(menuBtn, 10);
    }

    public void clickCheckFinesBtn() {
        clickBtnMenu();
        clickButton(checkFinesBtn, 10);
    }

    public void clickPaidForNumberUinBtn() {
        clickBtnMenu();
        clickButton(paidForNumberUinBtn, 10);
    }

    public void clickHistoryPay() {
        clickBtnMenu();
        clickButton(historyPay, 10);
    }

    public void clickDriversAndCarsBtn() {
        clickBtnMenu();
        clickButton(driversAndCarsBtn, 10);
    }

    public void clickBankCardBtn() {
        clickBtnMenu();
        clickButton(bankCardBtn, 10);
    }

    public void clickHelpBtn() {
        clickBtnMenu();
        clickButton(helpBtn, 10);
    }

    public void clickJuristBtn() {
        clickBtnMenu();
        clickButton(juristBtn, 10);
    }

    public void clickRateAppBtn() {
        clickBtnMenu();
        clickButton(rateAppBtn, 10);
    }

    public void clickShareBtn() {
        clickBtnMenu();
        clickButton(shareBtn, 10);
    }

    public void clickAnotherAppBtn() {
        clickBtnMenu();
        clickButton(anotherAppBtn, 10);
    }
}
