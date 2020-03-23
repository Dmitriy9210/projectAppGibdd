package screensSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IntroSelectors {

    private WebDriver driver;

    By menuBtn = By.id("//*[contains(@text, 'menu')]");



    @FindBy(xpath = "//*[contains(@text, 'есть')]")
    protected WebElement waitPicture;

//    @FindBy(xpath = "//*[contains(@text, 'menu')]")
//    public  WebElement menuBtn;

    @FindBy(xpath = "//*[contains(@text, 'регистрац')]")
    protected WebElement inputSTS;

    @FindBy(xpath = "//android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText")
    protected WebElement inputSTS2;

    @FindBy(xpath = "//*[contains(@text, 'достоверение')]")
    protected WebElement inputVY;

    @FindBy(xpath = "//android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText")
    protected WebElement inputVY2;

    @FindBy(xpath = "//*[contains(@text, 'НАЙТИ')]")
    protected WebElement findBtn;

    @FindBy(xpath = "//*[contains(@text, 'ОПЛАТИТЬ')]")
    protected WebElement buttonSearchUin;

    @FindBy(xpath = "//*[contains(@text, 'постановления')]")
    protected WebElement inputUin;

    @FindBy(xpath = "//android.widget.EditText")
    protected WebElement inputUin2;


    public IntroSelectors (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

}
