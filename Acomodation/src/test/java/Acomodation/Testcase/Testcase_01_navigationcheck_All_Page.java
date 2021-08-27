package Acomodation.Testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import Acomodation.Pageobject.Homepage_PO;

public class Testcase_01_navigationcheck_All_Page extends Base{
	@Test
	public void navigations() throws IOException
	{
		Homepage_PO p=new Homepage_PO(driver);
		
		
		p.Holidayele().click();
		logger.info("navigate to the Holiday page");
		logger.info("Take the screenshots for holiday page");		
		takescreenshots("Testcase_01_navigationcheck_All_Page", "holiday page", driver);
		logger.info("Screen shot for holiday hasbeen taken");
		
		
		p.Hotelsele().click();
		logger.info("Navigate to the hotels");
		logger.info("Take screenshots for hotels ");
		takescreenshots("Testcase_01_navigationcheck_All_Page", "Hotels page", driver);
		logger.info("Screenshots taken");
		
		
		p.flightele().click();
		logger.info("Navigate to the flight");
		logger.info("Take screenshots for flight ");
		takescreenshots("Testcase_01_navigationcheck_All_Page", "flight page", driver);
		logger.info("Screenshots taken");
	}
	
	

}
