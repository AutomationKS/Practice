package Acomodation.Utilites;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreporting {
	static ExtentReports extent;
	
	public static ExtentReports getreport()
	{
		String timestamp= new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());
		String path=System.getProperty("user.dir")+"/reports/"+ timestamp +"index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("KumarAutomations");
		reporter.config().setDocumentTitle("Test result Kumar");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Kumar", "Test");
		return extent;
		
	}
	

}
