package screensPages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.xpath;

public class IntroPage extends AbstractPage {

    private MenuPage menuPage = new MenuPage(driver);

    private By waitPicture = xpath("//*[contains(@text, '����')]");
    private By inputSts = xpath("//*[contains(@text, '����-��')]/following-sibling::android.view.View/child::android.widget.EditText");
    private By inputLicenceDriver = xpath("//*[contains(@text, '���. �������������')]/following-sibling::android.view.View/child::android.widget.EditText");
    private By findBtn = xpath("//*[contains(@text, '�����')]");
    private By buttonSearchUin = xpath("//*[contains(@text, '��������')]");
    private By goToPagePayUin = xpath("//*[contains(@text, '�Π�����')]");
    private By inputUin = xpath("//android.widget.EditText");

    public IntroPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }




    public void waitPicturesOnMainScreen() {//������� �������� ���� � ���������
        menuPage.waitBtnMenu();
        waitElement(waitPicture, 10);
    }

    private void inputFieldSts(String text) { // ��������� ��� ��� ������
        waitPicturesOnMainScreen();
        sendValue(inputSts, 20, text);
    }

    private void inputFieldLicenceDriver(String text) { // ��������� �� ��� ������
        waitPicturesOnMainScreen();
        sendValue(inputLicenceDriver, 20, text);
    }

    private void clickBtnSearch() { //�������� ������ ������
        clickButton(findBtn, 10);
    }

    private void goToFindForUin() {//��������� �� ����� ���������� ��� ��� ����������
        waitPicturesOnMainScreen();
        clickButton(buttonSearchUin, 10);
        waitElement(goToPagePayUin, 10);
        waitElement(inputUin, 10);
        waitElement(findBtn, 10);
    }

    private void inputFieldUin(String text) { //��������� ���
        goToFindForUin();
        sendValue(inputUin, 20, text);
    }

    public void inputFieldStsAndClickSearch(String text) { //���� ���������� �� ���
        inputFieldSts(text);
        clickBtnSearch();
    }

    public void inputFieldLicenceDriverAndClickSerch(String text) { //���� ���������� �� ��
        inputFieldLicenceDriver(text);
        clickBtnSearch();
    }

    public void inputBothField(String textSts, String textLicense) { //���� ���������� �� ��� � ��
        inputFieldSts(textSts);
        inputFieldLicenceDriver(textLicense);
        clickBtnSearch();
    }

    public void searchForUin(String text) { //���� ���������� �� ���
        inputFieldUin(text);
        clickBtnSearch();
    }

}
