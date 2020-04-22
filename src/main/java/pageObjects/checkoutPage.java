package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkoutPage {

	static By  statusShoppingCart=By.cssSelector(".page-title>h1");
	static By  mobileLink=By.xpath("//*[@id=\"nav\"]/ol/li[1]/a");
	
	public static WebElement getstatusShoppingCart(WebDriver driver)
		{
			System.out.println("In checkout page , retrieveing status of shopping cart");
			return driver.findElement(statusShoppingCart);
		}
	public static WebElement getMobLink(WebDriver driver)
	{
		System.out.println("In checkout page , retrieveing mobile link");
		return driver.findElement(mobileLink);
	}
		
}
