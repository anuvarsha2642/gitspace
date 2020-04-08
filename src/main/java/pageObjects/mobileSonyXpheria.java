package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mobileSonyXpheria {
	static By  mobSonyXperiaPrice=By.cssSelector("#product-price-1 > span:nth-child(1)");
	static By  mobSonyXperiaImage=By.cssSelector("#product-collection-image-1");

	public static WebElement getmobSonyXperiaPrice(WebDriver driver)
	{
		System.out.println("In mobile page,Retriving Price for Sony Xpheria");
		return driver.findElement(mobSonyXperiaPrice);
	}
	
	

	public static WebElement getmobSonyXperiaImage(WebDriver driver)
	{
		System.out.println("In mobile page,Retriving  Sony Xpheria");
		return driver.findElement(mobSonyXperiaImage);
	}

	
}
