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
		logger.info("Take the screenshots");
		
		takescreenshots("Testcase_01_navigationcheck_All_Page", "Manual", driver);
		
		logger.info("Screen shot for holiday hasbeen taken");
		
		
	}
	
	

}
