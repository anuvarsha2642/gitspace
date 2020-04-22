package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MobilePopUpWindow {

	
	static By samsungGalaxyInPopUpWindow=By.cssSelector(".product-name>a[title='Samsung Galaxy']");
	static By iphonePresenceInPopUpWindow=By.cssSelector(".product-name>a[title='IPhone']");
	public static WebElement getSamsungGalaxy(WebDriver driver)
		{
			System.out.println("In PopUpWindow  , retrieveing samsungGalaxyPresence");
			return driver.findElement(samsungGalaxyInPopUpWindow);
		}
	public static WebElement getIphonePresenceInPopUpWindow(WebDriver driver)
	{
		System.out.println("In PopUpWindow  , retrieveing IphonePresence");
		return driver.findElement(iphonePresenceInPopUpWindow);
	}
		



}
