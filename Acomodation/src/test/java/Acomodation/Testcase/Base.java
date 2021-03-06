package Acomodation.Testcase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

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

	@BeforeTest
	public void lunchderiver() {
		logger = Logger.getLogger("Acomodation");
		PropertyConfigurator.configure("Log4j.properties");
		driver=initializedriver("Chrome");
		
		logger.info("Enter the link");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(r.URL());
		logger.info("Home page displayed");
	}

	@AfterTest

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
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());
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
	
	public void waits(By ele)
	{
		WebDriverWait w=new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(ele));

	}
}
