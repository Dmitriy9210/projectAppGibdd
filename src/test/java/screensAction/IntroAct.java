package screensAction;

import com.sun.org.apache.xml.internal.utils.URI;
import gibdd.DriverManager;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import screensSelectors.IntroSelectors;

import java.net.MalformedURLException;


public class IntroAct extends IntroSelectors{

    private DriverManager gibdd = new DriverManager();

    @BeforeMethod(groups = "search")
    public void setUp() throws URI.MalformedURIException, MalformedURLException, InterruptedException {
        gibdd.setUp();
        Thread.sleep(10000);
        gibdd.waiter(waitPicture, 90);
    }

    @AfterMethod(groups = "search")
    public void nextTest() {
        gibdd.nextTest();
    }

    @AfterTest(groups = "search")
    public void closeApp() {
        gibdd.closeApp();
    }

    @Owner(value = "Дмитрий Авраменко")
    @Severity(value = SeverityLevel.CRITICAL)
    @Story(value = "Страница Интро")
    @Test(groups = "open")
    @Description(value = "Открытие приложения")
    public void openMenu() {
        WebElement buttonMenu = gibdd.waiter(menuBtn, 20);
        buttonMenu.click();
    }

    @Owner(value = "Дмитрий Авраменко")
    @Severity(value = SeverityLevel.MINOR)
    @Story(value = "Страница Интро")
    @Parameters("docSTS")
    @Test(groups = "search")
    @Description(value = "Заполнение полей: СТС")
    public void searchSts(String docSTS) {
        WebElement writeInInputSts = gibdd.waiter(inputSts, 20);
        writeInInputSts.sendKeys(docSTS);
        gibdd.waiter(findBtn, 3).click();
    }

    @Owner(value = "Дмитрий Авраменко")
    @Severity(value = SeverityLevel.NORMAL)
    @Story(value = "Страница Интро")
    @Parameters("docVY")
    @Test(groups = "search")
    @Description(value = "Заполнение полей: ВУ")
    public void searchVy(String docVY) {
        WebElement writeInInputVy = gibdd.waiter(inputDriver, 20);
        writeInInputVy.sendKeys(docVY);
        gibdd.waiter(findBtn, 3).click();
    }

    @Owner(value = "Дмитрий Авраменко")
    @Severity(value = SeverityLevel.MINOR)
    @Story(value = "Страница Интро")
    @Parameters({"docSTS", "docVY"})
    @Test(groups = "search")
    @Description(value = "Заполнение полей: СТС и ВУ")
    public void searchBothDoc(String docSTS, String docVY) {
        WebElement writeInInputSts = gibdd.waiter(inputSts, 20);
        writeInInputSts.sendKeys(docSTS);
        WebElement writeInInputVy = gibdd.waiter(inputDriver, 20);
        writeInInputVy.sendKeys(docVY);
        gibdd.waiter(findBtn, 3).click();
    }

    @Owner(value = "Дмитрий Авраменко")
    @Severity(value = SeverityLevel.MINOR)
    @Story(value = "Страница Интро")
    @Parameters("numberUIN")
    @Test(groups = "searchUIN")
    @Description(value = "Заполнение полей: УИН")
    public void searchUin(String numberUIN) {
        WebElement findUinBtn = gibdd.waiter(buttonSearchUin, 20);
        findUinBtn.click();
        gibdd.waiter(goToPagePayUin, 30);
        WebElement findUinInput = gibdd.waiter(inputUin, 40);
        findUinInput.sendKeys(numberUIN);
        gibdd.waiter(findBtn, 3).click();
    }

}