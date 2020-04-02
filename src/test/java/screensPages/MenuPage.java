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
    private By checkFinesBtn = xpath("//*[contains(@text, '�������� �������')]");
    private By paidForNumberUinBtn = xpath("//*[contains(@text, '������ �� �������������')]");
    private By historyPay = xpath("//*[contains(@text, '�������')]");
    private By driversAndCarsBtn = xpath("//*[contains(@text, '�������� � ��')]");
    private By bankCardBtn = xpath("//*[contains(@text, '���������� �����')]");
    private By helpBtn = xpath("//*[contains(@text, '������')]");
    private By juristBtn = xpath("//*[contains(@text, '������������ ������')]");
    private By rateAppBtn = xpath("//*[contains(@text, '������� ����������')]");
    private By shareBtn = xpath("//*[contains(@text, '����������')]");
    private By anotherAppBtn = xpath("//*[contains(@text, '������ ����������')]");


    public void waitBtnMenu() { //������� ������ ����
        waitElement(menuBtn, 90);
    }

    public void clickBtnMenu() { //������� ������ ����
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
