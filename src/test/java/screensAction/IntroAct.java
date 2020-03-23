package screensAction;

import com.sun.org.apache.xml.internal.utils.URI;
import gibdd.DriverManager;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.*;
import org.testng.annotations.*;
import screensSelectors.IntroSelectors;

import java.net.MalformedURLException;


public class IntroAct {


//    @FindBy(xpath = "//*[contains(@text, 'menu')]")
//    private WebElement menuBtn;


    private DriverManager gibdd = new DriverManager();

    @BeforeMethod(groups = "search")
    public void setUp() throws URI.MalformedURIException, MalformedURLException, InterruptedException {
        gibdd.setUp();
        Thread.sleep(10000);
//        gibdd.waiter(waitPicture, 90);
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
        AppiumDriver driver = (new DriverManager()).getDriver();
        IntroSelectors introSelectors = new IntroSelectors(driver);
//        WebElement buttonMenu =
                gibdd.waiter(menuBtn, 20);
        introSelectors.menuBtn.click();
    }

//    @Owner(value = "Дмитрий Авраменко")
//    @Severity(value = SeverityLevel.MINOR)
//    @Story(value = "Страница Интро")
//    @Parameters("docSTS")
//    @Test(groups = "search")
//    @Description(value = "Заполнение полей: СТС")
//    public void searchSts(String docSTS) {
//        WebElement inputSts = gibdd.waiter(By.xpath("//*[contains(@text, 'Свид-во')]/following-sibling::android.view.View/child::android.widget.EditText"), 20);
//        inputSts.sendKeys(docSTS);
//        gibdd.waiter(By.xpath("//*[contains(@text, 'НАЙТИ')]"), 3).click();
//    }
//
//    @Owner(value = "Дмитрий Авраменко")
//    @Severity(value = SeverityLevel.NORMAL)
//    @Story(value = "Страница Интро")
//    @Parameters("docVY")
//    @Test(groups = "search")
//    @Description(value = "Заполнение полей: ВУ")
//    public void searchVy(String docVY) {
//        WebElement inputVy = gibdd.waiter(By.xpath("//*[contains(@text, 'Вод. удостоверение')]/following-sibling::android.view.View/child::android.widget.EditText"), 20);
//        inputVy.sendKeys(docVY);
//        gibdd.waiter(By.xpath("//*[contains(@text, 'НАЙТИ')]"), 3).click();
//    }
//
//    @Owner(value = "Дмитрий Авраменко")
//    @Severity(value = SeverityLevel.MINOR)
//    @Story(value = "Страница Интро")
//    @Parameters({"docSTS", "docVY"})
//    @Test(groups = "search")
//    @Description(value = "Заполнение полей: СТС и ВУ")
//    public void searchBothDoc(String docSTS, String docVY) {
//        WebElement inputSts = gibdd.waiter(By.xpath("//*[contains(@text, 'Свид-во')]/following-sibling::android.view.View/child::android.widget.EditText"), 20);
//        inputSts.sendKeys(docSTS);
//        WebElement inputVy = gibdd.waiter(By.xpath("//*[contains(@text, 'Вод. удостоверение')]/following-sibling::android.view.View/child::android.widget.EditText"), 20);
//        inputVy.sendKeys(docVY);
//        gibdd.waiter(By.xpath("//*[contains(@text, 'НАЙТИ')]"), 3).click();
//    }
//
//    @Owner(value = "Дмитрий Авраменко")
//    @Severity(value = SeverityLevel.MINOR)
//    @Story(value = "Страница Интро")
//    @Parameters("numberUIN")
//    @Test(groups = "searchUIN")
//    @Description(value = "Заполнение полей: УИН")
//    public void searchUin(String numberUIN) {
//        WebElement findUINbtn = gibdd.waiter(By.xpath("//*[contains(@text, 'ОПЛАТИТЬ')]"), 20);
//        findUINbtn.click();
//        gibdd.waiter(By.xpath("//*[contains(@text, 'ПО ПОСТА')]"), 30);
//        WebElement findUIN = gibdd.waiter(By.xpath("//android.widget.EditText"), 40);
//        findUIN.sendKeys(numberUIN);
//        gibdd.waiter(By.xpath("//*[contains(@text, 'НАЙТИ')]"), 10).click();
//    }

}