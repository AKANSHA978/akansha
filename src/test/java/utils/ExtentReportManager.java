package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

    public static ExtentReports getInstance() {
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter reporter = new ExtentSparkReporter("test-output/ExtentReport.html");
        reporter.config().setReportName("SauceDemo Automation Report");
        reporter.config().setDocumentTitle("Automation Results");
        extent.attachReporter(reporter);
        return extent;
    }
}
