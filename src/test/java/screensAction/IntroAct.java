package screensAction;

import com.sun.org.apache.xml.internal.utils.URI;
import gibdd.DriverManager;
import io.qameta.allure.*;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import screensPages.IntroPage;

import java.net.MalformedURLException;


public class IntroAct {

    private DriverManager driverManager = new DriverManager();
    private IntroPage introPage = new IntroPage();

    @BeforeMethod()
    public void setUp() throws URI.MalformedURIException, MalformedURLException, InterruptedException {
        driverManager.setUp();
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
        introPage.waitPicturesOnMainScreen();

    }

    @Story(value = "Страница Интро")
    @Parameters("docSTS")
    @Test()
    @Description(value = "Заполнение полей: СТС")
    public void searchSts(String docSTS) {
        introPage.inputFieldStsAndClickSearch(docSTS);
    }

    @Story(value = "Страница Интро")
    @Parameters("docVY")
    @Test()
    @Description(value = "Заполнение полей: ВУ")
    public void searchVy(String docVY) {
       introPage.inputFieldLicenceDriverAndClickSerch(docVY);
    }

    @Story(value = "Страница Интро")
    @Parameters({"docSTS", "docVY"})
    @Test()
    @Description(value = "Заполнение полей: СТС и ВУ")
    public void searchBothDoc(String docSTS, String docVY) {
        introPage.inputBothField(docSTS,docVY);
    }

    @Story(value = "Страница Интро")
    @Parameters("numberUIN")
    @Test()
    @Description(value = "Заполнение полей: УИН")
    public void searchUin(String numberUIN) {
       introPage.searchForUin(numberUIN);
    }

}