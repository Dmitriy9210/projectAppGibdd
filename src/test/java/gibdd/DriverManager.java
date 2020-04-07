package gibdd;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {


    public static AppiumDriver<MobileElement> driver;

    public DriverManager(AppiumDriver<MobileElement> driver) {
        DriverManager.driver = driver;
    }

    public static void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.oplatagosuslug.gibdd");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "MainActivity");
        caps.setCapability(MobileCapabilityType.APP, "D:\\joba\\app-debug.apk");
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "1250");
        URL appiumURL = new URL("http://localhost:4723/wd/hub");

        driver = new AppiumDriver<MobileElement>(appiumURL, caps);
    }

    public AppiumDriver<MobileElement> getDriver() {
        return driver;
    }

    public void nextTest() {
        driver.resetApp();
    }

    public void closeApp() {
        driver.quit();
    }

    public void takeScreenShot() {
        try {
            File screenshot = ((TakesScreenshot) driver).
                    getScreenshotAs(OutputType.FILE);
            String path = "./target/screenshots/fails/" + screenshot.getName();
            FileUtils.copyFile(screenshot, new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}