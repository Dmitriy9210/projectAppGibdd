package gibdd;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class DotTestListener extends TestListenerAdapter {
    private int m_count = 0;

    @Override
    public void onTestFailure(ITestResult tr) {
        System.out.print("dsdsds");
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        System.out.print("dsdsds");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        System.out.print("dsdsds");
    }

    private void log(String string) {
        System.out.print(string);
        if (++m_count % 40 == 0) {
            System.out.println("");
        }
    }
}
