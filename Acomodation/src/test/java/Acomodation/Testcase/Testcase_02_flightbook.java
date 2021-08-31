package Acomodation.Testcase;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Acomodation.Pageobject.Flight_PO;
import Acomodation.Pageobject.Homepage_PO;

public class Testcase_02_flightbook extends Base {

	@Test
	public void bookflight() throws InterruptedException, IOException {
		Homepage_PO p = new Homepage_PO(driver);
		Flight_PO f = new Flight_PO(driver);

		p.flightele().click();
		f.Onewayele().click();
		f.Dcityele().click();
		f.Dcityboxele().sendKeys("Hyderabad");
		logger.info("Fomcity details entered");
		f.Tcityele().click();
				
		Thread .sleep(2000);
		f.Tcitybocele().sendKeys("Pune");
		Thread.sleep(2000);
		takescreenshots("bookflight", "book", driver);

	}

}
