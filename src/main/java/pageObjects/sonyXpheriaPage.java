package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sonyXpheriaPage {

	static By  mobSonyXperiaPagePrice=By.cssSelector(".price");
	
	public static WebElement getSonyXperiaPrice(WebDriver driver)
	{
		System.out.println("In mobile page,Retriving Price for Sony Xpheria");
		return driver.findElement(mobSonyXperiaPagePrice);
	}
	
	
}
