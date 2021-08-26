package Acomodation.Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage_PO {
	public WebDriver driver;
	
	
public Homepage_PO(WebDriver driver)
{
	this.driver=driver;
	
}
public static By Flighlocator=By.xpath("//a[@title='Flights']");

public WebElement flightele()
{
	return driver.findElement(Flighlocator);
	
}

public static By Hotelslocator=By.xpath("//a[@title='Hotels']");

public WebElement Hotelsele()
{
	return driver.findElement(Hotelslocator);
	
}

public static By Holidaylocator=By.xpath("//a[@title='Holiday Packages']");

public WebElement Holidayele()
{
	return driver.findElement(Holidaylocator);
	
}



}
