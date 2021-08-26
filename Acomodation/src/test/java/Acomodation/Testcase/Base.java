package Acomodation.Testcase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Acomodation.Utilites.Readproperty;

public class Base {
	public static WebDriver driver;
	Readproperty r = new Readproperty();
	public static Logger logger;

	

	public WebDriver initializedriver(String browser) {

		if (browser.contentEquals("Chrome")) {
			logger.info("Chrome browser intitiated");
			System.setProperty("webdriver.chrome.driver", r.Chromepath());
			driver = new ChromeDriver();
			logger.info("Browser open successfully");

		}
		return driver;

	}

	@BeforeMethod
	public void lunchderiver() {
		logger = Logger.getLogger("Acomodation");
		PropertyConfigurator.configure("Log4j.properties");
		driver=initializedriver("Chrome");
		
		logger.info("Enter the link");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(r.URL());
		logger.info("Home page displayed");
	}

	@AfterMethod

	public void closebrowser() {
		
		logger.info("The Browser redy to close");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		logger.info("Browser closed");
	}

	public String takescreenshots(String testcasename, String status, WebDriver driver) throws IOException {
		logger.info("Will take a screenshots");
		String timestamp = new SimpleDateFormat("yyyy.mm.dd.hh.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		String filename = System.getProperty("user.dir") + "/reports/" + testcasename + status + timestamp + ".png";
		FileUtils.copyFile(f, new File(filename));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logger.info("Screenshots has been taken");
		return filename;
	}
}
