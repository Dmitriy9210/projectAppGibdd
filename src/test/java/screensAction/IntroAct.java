package screensAction;

import com.sun.org.apache.xml.internal.utils.URI;
import gibdd.TestGibdd;
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
        gibdd.waiter(By.xpath("//*[contains(@text, 'есть')]"), 50);
    }

    @AfterMethod(groups = "search")
    public void nextTest() {
        gibdd.nextTest();
    }

    @AfterTest(groups = "search")
    public void closeApp() {
        gibdd.closeApp();
    }

    @Test (groups = "open")
    public void openMenu() {
        WebElement buttonMenu = gibdd.waiter(By.xpath("//*[contains(@text, 'menu')]"), 20);
        buttonMenu.click();
    }

    @Parameters("docSTS")
    @Test (groups = "search")
    public void searchSts(String docSTS)   {
        WebElement inputSts = gibdd.waiter(By.xpath("//android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText"), 20);
        inputSts.sendKeys(docSTS);
        gibdd.waiter(By.xpath("//*[contains(@text, 'НАЙТИ')]"), 3).click();
    }

    @Parameters("docVY")
    @Test (groups = "search")
    public void searchVy(String docVY)   {
        WebElement inputVy = gibdd.waiter(By.xpath("//android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText"), 20);
        inputVy.sendKeys(docVY);
        gibdd.waiter(By.xpath("//*[contains(@text, 'НАЙТИ')]"), 3).click();
    }

    @Parameters({"docSTS", "docVY"})
    @Test(groups = "search")
    public void searchBothDoc(String docSTS, String docVY) {
        WebElement inputSts = gibdd.waiter(By.xpath("//android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText"), 20);
        inputSts.sendKeys(docSTS);
        WebElement inputVy = gibdd.waiter(By.xpath("//android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText"), 20);
        inputVy.sendKeys(docVY);
        gibdd.waiter(By.xpath("//*[contains(@text, 'НАЙТИ')]"), 3).click();
    }

    @Parameters("nomberUIN")
    @Test(groups = "searchUIN")
    public void searchUin(String nomberUIN) {
        WebElement findUINbtn = gibdd.waiter(By.xpath("//*[contains(@text, 'ОПЛАТИТЬ')]"), 20);
        findUINbtn.click();
        gibdd.waiter(By.xpath("//*[contains(@text, 'ПО ПОСТА')]"),30);
        WebElement findUIN = gibdd.waiter(By.xpath("//android.widget.EditText"), 40);
        findUIN.sendKeys(nomberUIN);
        gibdd.waiter(By.xpath("//*[contains(@text, 'НАЙТИ')]"), 10).click();
    }

}