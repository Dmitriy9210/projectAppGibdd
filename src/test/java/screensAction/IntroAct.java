package screensAction;

import com.sun.org.apache.xml.internal.utils.URI;
import gibdd.DriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.qameta.allure.*;
import org.testng.annotations.*;
import screensPages.IntroPage;

import java.net.MalformedURLException;


public class IntroAct {
    private AppiumDriver<MobileElement> driver;


    private DriverManager driverManager = new DriverManager(driver);
//    private IntroPage introPage = new IntroPage(driver);

    @BeforeMethod()
    public void setUp() throws URI.MalformedURIException, MalformedURLException, InterruptedException {
        driverManager.setUp();
        this.driver = driverManager.getDriver();
        IntroPage introPage = new IntroPage(driver);
        introPage.waitBtnMenu();
    }

    @AfterMethod()
    public void nextTest() {
        driverManager.nextTest();
    }

    @AfterTest()
    public void closeApp() {
        driverManager.closeApp();
    }


    @Story(value = "Страница Интро")
    @Test()
    @Description(value = "Открытие приложения")
    public void openMenu() {
        new IntroPage(driver).waitPicturesOnMainScreen();

    }

    @Story(value = "Страница Интро")
    @Parameters("docSTS")
    @Test()
    @Description(value = "Заполнение полей: СТС")
    public void searchSts(String docSTS) {
        new IntroPage(driver).inputFieldStsAndClickSearch(docSTS);
    }

    @Story(value = "Страница Интро")
    @Parameters("docVY")
    @Test()
    @Description(value = "Заполнение полей: ВУ")
    public void searchVy(String docVY) {
        new IntroPage(driver).inputFieldLicenceDriverAndClickSerch(docVY);
    }

    @Story(value = "Страница Интро")
    @Parameters({"docSTS", "docVY"})
    @Test()
    @Description(value = "Заполнение полей: СТС и ВУ")
    public void searchBothDoc(String docSTS, String docVY) {
        new IntroPage(driver).inputBothField(docSTS,docVY);
    }

    @Story(value = "Страница Интро")
    @Parameters("numberUIN")
    @Test()
    @Description(value = "Заполнение полей: УИН")
    public void searchUin(String numberUIN) {
        new IntroPage(driver).searchForUin(numberUIN);
    }
}