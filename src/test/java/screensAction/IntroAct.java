package screensAction;

import com.sun.org.apache.xml.internal.utils.URI;
import gibdd.DriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.qameta.allure.*;
import org.testng.annotations.*;
import screensPages.IntroPage;
import screensPages.MenuPage;

import java.net.MalformedURLException;


public class IntroAct {
    private AppiumDriver<MobileElement> driver;


    private DriverManager driverManager = new DriverManager(driver);
//    private IntroPage introPage = new IntroPage(driver);

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


    @Story(value = "�������� �����")
    @Test()
    @Description(value = "�������� ����������")
    public void openMenu() {
        new IntroPage(driver).waitPicturesOnMainScreen();
    }

    @Story(value = "�������� �����")
    @Parameters("docSTS")
    @Test()
    @Description(value = "���������� �����: ���")
    public void searchSts(String docSTS) {
        new IntroPage(driver).inputFieldStsAndClickSearch(docSTS);
    }

    @Story(value = "�������� �����")
    @Parameters("docVY")
    @Test()
    @Description(value = "���������� �����: ��")
    public void searchVy(String docVY) {
        new IntroPage(driver).inputFieldLicenceDriverAndClickSerch(docVY);
    }

    @Story(value = "�������� �����")
    @Parameters({"docSTS", "docVY"})
    @Test()
    @Description(value = "���������� �����: ��� � ��")
    public void searchBothDoc(String docSTS, String docVY) {
        new IntroPage(driver).inputBothField(docSTS,docVY);
    }

    @Story(value = "�������� �����")
    @Parameters("numberUIN")
    @Test()
    @Description(value = "���������� �����: ���")
    public void searchUin(String numberUIN) {
        new IntroPage(driver).searchForUin(numberUIN);
    }
}