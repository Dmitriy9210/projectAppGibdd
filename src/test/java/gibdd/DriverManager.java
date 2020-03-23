package gibdd;

import com.sun.org.apache.xml.internal.utils.URI;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {

    private AppiumDriver<MobileElement> driver;

    public void setUp() throws URI.MalformedURIException, MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.oplatagosuslug.gibdd");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "MainActivity");
        caps.setCapability(MobileCapabilityType.APP, "/Users/macos/Documents/GitHub/gibdd/src/test/resources/App/app-debug.apk");
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "250");
        URL appiumURL = new URL("http://localhost:4723/wd/hub");

        driver = new AppiumDriver<MobileElement>(appiumURL, caps);
    }

    public AppiumDriver<MobileElement> getDriver() {
        return driver;
    }

    public void waiter(WebElement element, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
         wait.until(
                ExpectedConditions.visibilityOf(element)
        );
    }

    public void nextTest() {
        driver.resetApp();
    }

    public void closeApp() {
        driver.quit();
    }
}