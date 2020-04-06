package screensAction;

import com.sun.org.apache.xml.internal.utils.URI;
import gibdd.DotTestListener;
import gibdd.DriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.*;
import screensPages.MenuPage;

import java.net.MalformedURLException;

@Listeners({DotTestListener.class})

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
    @Description(value = "Проверка штрафов")
    public void openCheckFinesBtn() {
        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickCheckFinesBtn();
    }

    @Test()
    @Description(value = "Проверка штрафов по УИН ")
    public void openPaidForNumberUin() {
        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickPaidForNumberUinBtn();
    }

    @Test()
    @Description(value = "История платежей")
    public void openHistoryPay() {
        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickHistoryPay();
    }

    @Test()
    @Description(value = "Открытие Водители и ТС")
    public void openDriversAndCars() {
        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickDriversAndCarsBtn();
    }

    @Test()
    @Description(value = "Открытие Банковская карта")
    public void openBankCard() {
        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickBankCardBtn();
    }

    @Test()
    @Description(value = "Помощь")
    public void openHelp() {
        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickHelpBtn();
    }

    @Test()
    @Description(value = "Открытие Консультация юриста")
    public void openJurist() {
        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickJuristBtn();

    }

    @Test()
    @Description(value = "Открытие Оценить приложение")
    public void openRateApp() {
        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickRateAppBtn();
    }

    @Test()
    @Description(value = "Открытие Поделиться")
    public void openShare() {
        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickShareBtn();
    }

    @Test()
    @Description(value = "Открытие Другие приложения")
    public void openAnotherAppBtn() {
        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickAnotherAppBtn();
    }

    @Attachment(type = "image/png")
    public byte[] makeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
