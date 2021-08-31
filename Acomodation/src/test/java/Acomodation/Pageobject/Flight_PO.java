package Acomodation.Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Acomodation.Testcase.Base;

public class Flight_PO {
	public WebDriver driver;

	public Flight_PO(WebDriver driver) {
		this.driver = driver;
	}
Base b=new Base();

	By Onewaylocator = By.id("ctl00_mainContent_rbtnl_Trip_0");

	public WebElement Onewayele() {
		return driver.findElement(Onewaylocator);
	}

	By Dcitylocator = By.id("ctl00_mainContent_ddl_originStation1_CTXTaction");
	
	public WebElement Dcityele() {
		b.waits(Dcitylocator);
		
		return driver.findElement(Dcitylocator);
	}
By Dcityboxlocator=By.id("ctl00_mainContent_ddl_originStation1_CTXT");
public WebElement Dcityboxele()
{
	b.waits(Dcityboxlocator);
	return driver.findElement(Dcityboxlocator);
}
By Tcitylocator=By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction");
public WebElement Tcityele()
{
	return driver.findElement(Tcitylocator);
}

By Tcityoxlocator=By.id("ctl00_mainContent_ddl_destinationStation1_CTXT");

public WebElement Tcitybocele()
{
	b.waits(Tcityoxlocator);
	return driver.findElement(Tcityoxlocator);
}
}
