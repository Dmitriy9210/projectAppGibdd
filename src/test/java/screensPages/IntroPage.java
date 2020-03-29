package screensPages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.xpath;

public class IntroPage extends AbstractPage {

    private By menuBtn = xpath("//*[contains(@text, 'menu')]");
    private By waitPicture = xpath("//*[contains(@text, 'есть')]");
    private By inputSts = xpath("//*[contains(@text, 'Свид-во')]/following-sibling::android.view.View/child::android.widget.EditText");
    private By inputLicenceDriver = xpath("//*[contains(@text, 'Вод. удостоверение')]/following-sibling::android.view.View/child::android.widget.EditText");
    private By findBtn = xpath("//*[contains(@text, 'НАЙТИ')]");
    private By buttonSearchUin = xpath("//*[contains(@text, 'ОПЛАТИТЬ')]");
    private By goToPagePayUin = xpath("//*[contains(@text, 'ПО ПОСТА')]");
    private By inputUin = xpath("//android.widget.EditText");

    public IntroPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }


    public void waitBtnMenu() { //находим кнопку Меню
        waitElement(menuBtn, 90);
    }

    public void waitPicturesOnMainScreen() {//ожидаем картинку Авто с мигалками
        waitBtnMenu();
        waitElement(waitPicture, 10);
    }

    private void inputFieldSts(String text) { // Заполняем СТС без поиска
        waitPicturesOnMainScreen();
        sendValue(inputSts, 20, text);
    }

    private void inputFieldLicenceDriver(String text) { // Заполняем ВУ без поиска
        waitPicturesOnMainScreen();
        sendValue(inputLicenceDriver, 20, text);
    }

    private void clickBtnSearch() { //Нажимаем кнопку поиска
        clickButton(findBtn, 10);
    }

    private void goToFindForUin() {//Переходим на экран заполнения УИН без заполнения
        waitPicturesOnMainScreen();
        clickButton(buttonSearchUin, 10);
        waitElement(goToPagePayUin, 10);
    }

    private void inputFieldUin(String text) { //Заполняем УИН
        goToFindForUin();
        sendValue(inputUin, 10, text);
    }

    public void inputFieldStsAndClickSearch(String text) { //Ищем начисления по СТС
        inputFieldSts(text);
        clickBtnSearch();
    }

    public void inputFieldLicenceDriverAndClickSerch(String text) { //Ищем начисления по ВУ
        inputFieldLicenceDriver(text);
        clickBtnSearch();
    }

    public void inputBothField(String textSts, String textLicense) { //Ищем начисления по СТС и ВУ
        inputFieldSts(textSts);
        inputFieldLicenceDriver(textLicense);
        clickBtnSearch();
    }

    public void searchForUin(String text) { //Ищем начисления по УИН
        inputFieldUin(text);
        clickBtnSearch();
    }

}
