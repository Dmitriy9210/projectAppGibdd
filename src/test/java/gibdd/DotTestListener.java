package gibdd;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class DotTestListener extends TestListenerAdapter {

    private AppiumDriver<MobileElement> driver;

    @Override
    public void onTestFailure(ITestResult tr) {
        System.out.print("Тест Завален ");
        DriverManager driverManager =new DriverManager(driver);
                driverManager.takeScreenShot();
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        System.out.print("Тест пропущен");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        System.out.print("Тест Пройден");
    }


}
