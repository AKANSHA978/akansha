package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

    private static ExtentReports extent;

    // Initialize and return singleton instance
    public static ExtentReports getInstance() {
        if (extent == null) {
            initReport();
        }
        return extent;
    }

    // Initialize Extent report setup
    public static void initReport() {
        String reportPath = System.getProperty("user.dir") + "/test-output/ExtentReport.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
        reporter.config().setReportName("Recpal Automation Report");
        reporter.config().setDocumentTitle("Test Execution Report");

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Project", "Recpal");
        extent.setSystemInfo("Tester", "YourName");
        extent.setSystemInfo("OS", System.getProperty("os.name"));
        extent.setSystemInfo("Browser", "Chrome");
    }

    // Flush the report (call this in @AfterSuite)
    public static void flushReport() {
        if (extent != null) {
            extent.flush();
        }
    }
}
