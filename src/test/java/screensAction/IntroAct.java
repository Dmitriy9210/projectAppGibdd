package screensAction;

import com.sun.org.apache.xml.internal.utils.URI;
import gibdd.TestGibdd;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import screensSelectors.IntroSelectors;

import java.net.MalformedURLException;

public class IntroAct extends IntroSelectors {


    private TestGibdd gibdd = new TestGibdd();

    @BeforeMethod(groups = "search")
    public void setUp() throws URI.MalformedURIException, MalformedURLException {
        gibdd.setUp();
        gibdd.waiter(By.xpath("//*[contains(@text, 'есть')]"), 90);
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
        WebElement buttonMenu = gibdd.waiter(By.xpath("//*[contains(@text, 'menu')]"), 20);
        buttonMenu.click();
    }

    @Owner(value = "Дмитрий Авраменко")
    @Severity(value = SeverityLevel.MINOR)
    @Story(value = "Страница Интро")
    @Parameters("docSTS")
    @Test(groups = "search")
    @Description(value = "Заполнение полей: СТС")
    public void searchSts(String docSTS) {
        WebElement inputSts = gibdd.waiter(By.xpath("//android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText"), 20);
        inputSts.sendKeys(docSTS);
        gibdd.waiter(By.xpath("//*[contains(@text, 'НАЙТИ')]"), 3).click();
    }

    @Owner(value = "Дмитрий Авраменко")
    @Severity(value = SeverityLevel.NORMAL)
    @Story(value = "Страница Интро")
    @Parameters("docVY")
    @Test(groups = "search")
    @Description(value = "Заполнение полей: ВУ")
    public void searchVy(String docVY) {
        WebElement inputVy = gibdd.waiter(By.xpath("//android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText"), 20);
        inputVy.sendKeys(docVY);
        gibdd.waiter(By.xpath("//*[contains(@text, 'НАЙТИ')]"), 3).click();
    }

    @Owner(value = "Дмитрий Авраменко")
    @Severity(value = SeverityLevel.MINOR)
    @Story(value = "Страница Интро")
    @Parameters({"docSTS", "docVY"})
    @Test(groups = "search")
    @Description(value = "Заполнение полей: СТС и ВУ")
    public void searchBothDoc(String docSTS, String docVY) {
        WebElement inputSts = gibdd.waiter(By.xpath("//android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText"), 20);
        inputSts.sendKeys(docSTS);
        WebElement inputVy = gibdd.waiter(By.xpath("//android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText"), 20);
        inputVy.sendKeys(docVY);
        gibdd.waiter(By.xpath("//*[contains(@text, 'НАЙТИ')]"), 3).click();
    }

    @Owner(value = "Дмитрий Авраменко")
    @Severity(value = SeverityLevel.MINOR)
    @Story(value = "Страница Интро")
    @Parameters("numberUIN")
    @Test(groups = "searchUIN")
    @Description(value = "Заполнение полей: УИН")
    public void searchUin(String numberUIN) {
        WebElement findUINbtn = gibdd.waiter(By.xpath("//*[contains(@text, 'ОПЛАТИТЬ')]"), 20);
        findUINbtn.click();
        gibdd.waiter(By.xpath("//*[contains(@text, 'ПО ПОСТА')]"), 30);
        WebElement findUIN = gibdd.waiter(By.xpath("//android.widget.EditText"), 40);
        findUIN.sendKeys(numberUIN);
        gibdd.waiter(By.xpath("//*[contains(@text, 'НАЙТИ')]"), 10).click();
    }

}