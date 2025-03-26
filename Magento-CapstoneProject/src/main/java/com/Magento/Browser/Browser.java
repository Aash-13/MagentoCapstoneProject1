package com.Magento.Browser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Browser {
	public static WebDriver driver;                   //declared object globally
	public static WebDriverWait wait;
	public static Actions act;
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	public static ExtentTest logger1;
	public static void init(String reportName) {
		extent=new ExtentReports();
		reporter=new ExtentSparkReporter(System.getProperty("user.dir")+"//target//ExtentReports//"+reportName+".html");
		extent.attachReporter(reporter);
	}
	/*
	 * Open the browser based on the choice
	 */
	public static void openBrowser() throws Exception {
		logger1=extent.createTest("Open Browser");
		logger1.log(Status.INFO, "Opening the Browser");
		try {
			String choice = Utility.properties("browser"); 
			if (choice.equalsIgnoreCase("Chrome")) {
				driver = new ChromeDriver();
				logger1.log(Status.PASS, "Opening the ChromeBrowser");
			}
			else if (choice.equalsIgnoreCase("Edge")) {
				driver = new EdgeDriver();
				logger1.log(Status.PASS, "Opening the EdgeBrowser");
			}
			else if (choice.equalsIgnoreCase("Firefox")) {
				driver = new FirefoxDriver();
				logger1.log(Status.PASS, "Opening the FirefoxBrowser");
			}
		} catch (Exception e) {
			System.out.println("Browser - openBrowser");
			logger1.log(Status.FAIL, "Failed Opening Browser");
		}
		extent.flush();
	}
	/*
	 * Passes the URL of the application
	 */
	public static void navigateToUrl(String url) throws Exception {
		logger1=extent.createTest("Navigate to URL");
		logger1.log(Status.INFO, "Navigate to OrangeHRM");
		try {
			driver.get(url); 
			driver.manage().window().maximize();
			wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.titleIs("Home Page"));
			logger1.log(Status.PASS, "Navigated to OrangeHRM Webpage");
		} catch (Exception e) {
			System.out.println("Browser - geturl");
			logger1.log(Status.FAIL, "Failed Navigating to OrangeHRM");
		}
		extent.flush();
	}
	/*
	 * Closes the Browser
	 */
	public static void closeBrowser() throws Exception {
		logger1=extent.createTest("Close Browser");
		logger1.log(Status.INFO, "Closing the Browser");
		try {
			Thread.sleep(2000);
			driver.quit();
			logger1.log(Status.PASS, "Closing the ChromeBrowser");
		} catch (Exception e) {
			System.out.println("Browser - closeBrowser");
			logger1.log(Status.FAIL, "Failed Closing the ChromeBrowser");

		}
		extent.flush();
	}
}
