package gibdd;

import com.sun.org.apache.xml.internal.utils.URI;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class TestGibdd {

    private AppiumDriver<MobileElement> driver;

    public void setUp() throws URI.MalformedURIException, MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "192.168.65.102:5555");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.oplatagosuslug.gibdd");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "MainActivity");
        caps.setCapability(MobileCapabilityType.APP, "D:\\Проекты\\GibddApp\\src\\test\\resources\\App\\app-debug.apk");
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "120");
        URL appiumURL = new URL("http://localhost:4723/wd/hub");

        driver = new AppiumDriver<MobileElement>(appiumURL, caps);
    }

    public WebElement waiter(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(by)
        );
    }

    public void nextTest() {
        driver.resetApp();
    }

    public void closeApp() {
        driver.quit();
    }
}