package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentTest;


public class ExtentManager {

    private static ExtentReports extent;
    public static ExtentTest test;

    public static ExtentReports getReport() {

        if (extent == null) {

            ExtentSparkReporter spark =
                    new ExtentSparkReporter(
                            "Reports/AutomationReport.html");

            extent = new ExtentReports();

            extent.attachReporter(spark);

            extent.setSystemInfo(
                    "Tester",
                    "Prachi");
        }

        return extent;
    }
}