package screensAction;

import com.sun.org.apache.xml.internal.utils.URI;
import gibdd.DriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import screensPages.IntroPage;
import screensPages.MenuPage;

import java.net.MalformedURLException;

public class MenuAct {
    private AppiumDriver<MobileElement> driver;


    private DriverManager driverManager = new DriverManager(driver);

    @BeforeMethod()
    public void setUp() throws URI.MalformedURIException, MalformedURLException, InterruptedException {
        driverManager.setUp();
        this.driver = driverManager.getDriver();
        MenuPage menuPage = new MenuPage(driver);
        menuPage.waitBtnMenu();
    }

    @AfterMethod()
    public void nextTest() {
        driverManager.nextTest();
    }

    @AfterTest()
    public void closeApp() {
        driverManager.closeApp();
    }


    @Test()
    @Description(value = "�������� �������")
    public void openCheckFinesBtn() {
        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickCheckFinesBtn();
    }

    @Test()
    @Description(value = "�������� ������� �� ��� ")
    public void openPaidForNumberUin() {
        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickPaidForNumberUinBtn();
    }

    @Test()
    @Description(value = "������� ��������")
    public void openHistoryPay() {
        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickHistoryPay();
    }

    @Test()
    @Description(value = "�������� �������� � ��")
    public void openDriversAndCars() {
        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickDriversAndCarsBtn();
    }

    @Test()
    @Description(value = "�������� ���������� �����")
    public void openBankCard() {
        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickBankCardBtn();
    }

    @Test()
    @Description(value = "������")
    public void openHelp() {
        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickHelpBtn();
    }

    @Test()
    @Description(value = "�������� ������������ ������")
    public void openJurist() {
        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickJuristBtn();
    }

    @Test()
    @Description(value = "�������� ������� ����������")
    public void openRateApp() {
        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickRateAppBtn();
    }

    @Test()
    @Description(value = "�������� ����������")
    public void openShare() {
        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickShareBtn();
    }

    @Test()
    @Description(value = "�������� ������ ����������")
    public void openAnotherAppBtn() {
        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickAnotherAppBtn();
    }
}
