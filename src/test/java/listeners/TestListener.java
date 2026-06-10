package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utils.ExtentManager;

public class TestListener implements ITestListener {

    ExtentReports extent =
            ExtentManager.getReport();
    

    @Override
    public void onTestStart(
            ITestResult result) {

        ExtentManager.test =
                extent.createTest(
                        result.getName());

        System.out.println(
                "Test Started : "
                + result.getName());
    }

    @Override
    public void onTestSuccess(
            ITestResult result) {

    	ExtentManager.test.pass("Test Passed");

        System.out.println(
                "Test Passed : "
                + result.getName());

        extent.flush();
    }

    @Override
    public void onTestFailure(
            ITestResult result) {

    	ExtentManager.test.fail("Test Failed");

        System.out.println(
                "Test Failed : "
                + result.getName());

        extent.flush();
    }
}