package screensSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.By.xpath;

public class IntroSelectors {

//    private WebDriver driver;

    protected By menuBtn = xpath("//*[contains(@text, 'menu')]");
    protected By waitPicture = xpath( "//*[contains(@text, 'есть')]");
    protected By inputSts = xpath( "//*[contains(@text, 'Свид-во')]/following-sibling::android.view.View/child::android.widget.EditText");
    protected By findBtn = xpath( "//*[contains(@text, 'НАЙТИ')]");
    protected By inputDriver = xpath( "//*[contains(@text, 'Вод. удостоверение')]/following-sibling::android.view.View/child::android.widget.EditText");
    protected By buttonSearchUin = xpath( "//*[contains(@text, 'ОПЛАТИТЬ')]");
    protected By inputUin = xpath( "//android.widget.EditText");
    protected By goToPagePayUin = xpath( "//*[contains(@text, 'ПО ПОСТА')]");



//    @FindBy(xpath = "//android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText")
//    protected WebElement inputSTS2;
//
//    @FindBy(xpath = "//*[contains(@text, 'достоверение')]")
//    protected WebElement inputVY;

//    @FindBy(xpath = "//android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText")
//    protected WebElement inputVY2;

//    @FindBy(xpath = "//*[contains(@text, 'НАЙТИ')]")
//    protected WebElement findBtn;

//    @FindBy(xpath = "//*[contains(@text, 'ОПЛАТИТЬ')]")
//    protected WebElement buttonSearchUin;

//    @FindBy(xpath = "//*[contains(@text, 'постановления')]")
//    protected WebElement inputUin;

//    @FindBy(xpath = "//android.widget.EditText")
//    protected WebElement inputUin2;


//    public IntroSelectors (WebDriver driver) {
//        PageFactory.initElements(driver, this);
//        this.driver = driver;
//    }

}
