package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MobilePopUpWindow {

	
	static By sonyXpheriaInPopUpWindow=By.xpath("//*[@id=\"product_comparison\"]/tbody[1]/tr[1]/td[1]/h2/a");
	static By iphonePresenceInPopUpWindow=By.cssSelector(".product-name>a[title='IPhone']");
	public static WebElement getSonyXpheria(WebDriver driver)
		{
			System.out.println("In PopUpWindow  , retrieveing samsungGalaxyPresence");
			return driver.findElement(sonyXpheriaInPopUpWindow);
		}
	public static WebElement getIphonePresenceInPopUpWindow(WebDriver driver)
	{
		System.out.println("In PopUpWindow  , retrieveing IphonePresence");
		return driver.findElement(iphonePresenceInPopUpWindow);
	}
		



}
