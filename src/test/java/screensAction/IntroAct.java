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


    @BeforeMethod
    public void setUp() throws URI.MalformedURIException, MalformedURLException {
        gibdd.setUp();
        gibdd.waiter(By.xpath("//*[contains(@text, 'есть')]"), 50);
    }

    @AfterMethod
    public void nextTest() {
        gibdd.nextTest();
    }

    @AfterTest
    public void closeApp() {
        gibdd.closeApp();
    }

    @Test (groups = "open")
    public void openMenu() {
        WebElement buttonMenu = gibdd.waiter(By.xpath("//*[contains(@text, 'menu')]"), 20);
        buttonMenu.click();
    }

    @Test (groups = "search")
    public void searchSts()   {
        WebElement inputSts = gibdd.waiter(By.xpath("//android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText"), 20);
        inputSts.sendKeys("1234567891");
        gibdd.waiter(By.xpath("//*[contains(@text, 'НАЙТИ')]"), 3).click();
    }

    @Test (groups = "search")
    public void searchVy()   {
        WebElement inputVy = gibdd.waiter(By.xpath("//android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText"), 20);
        inputVy.sendKeys("1234567891");
        gibdd.waiter(By.xpath("//*[contains(@text, 'НАЙТИ')]"), 3).click();
    }

    @Test(groups = "search")
    public void searchBothDoc()   {
        WebElement inputSts = gibdd.waiter(By.xpath("//android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText"), 20);
        inputSts.sendKeys("1234567891");
        WebElement inputVy = gibdd.waiter(By.xpath("//android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText"), 20);
        inputVy.sendKeys("9876543210");
        gibdd.waiter(By.xpath("//*[contains(@text, 'НАЙТИ')]"), 3).click();
    }

    @Test(groups = "searchUIN")
    public void searchUin()   {
        WebElement findUINbtn = gibdd.waiter(By.xpath("//*[contains(@text, 'ОПЛАТИТЬ')]"), 20);
        findUINbtn.click();
        WebElement findUIN = gibdd.waiter(By.xpath("//android.widget.EditText"), 20);
        findUIN.sendKeys("18810177180708116003");
        gibdd.waiter(By.xpath("//*[contains(@text, 'НАЙТИ')]"), 3).click();
    }

}