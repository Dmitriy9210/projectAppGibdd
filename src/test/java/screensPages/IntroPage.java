package screensPages;

import org.openqa.selenium.By;
import static org.openqa.selenium.By.xpath;

public class IntroPage {

    protected By menuBtn = xpath("//*[contains(@text, 'menu')]");
    protected By waitPicture = xpath( "//*[contains(@text, 'есть')]");
    protected By inputSts = xpath( "//*[contains(@text, 'Свид-во')]/following-sibling::android.view.View/child::android.widget.EditText");
    protected By findBtn = xpath( "//*[contains(@text, 'НАЙТИ')]");
    protected By inputDriver = xpath( "//*[contains(@text, 'Вод. удостоверение')]/following-sibling::android.view.View/child::android.widget.EditText");
    protected By buttonSearchUin = xpath( "//*[contains(@text, 'ОПЛАТИТЬ')]");
    protected By inputUin = xpath( "//android.widget.EditText");
    protected By goToPagePayUin = xpath( "//*[contains(@text, 'ПО ПОСТА')]");



}
