package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MobilePage {
	static By  mobSonyXperiaPrice=By.cssSelector("#product-price-1 > span:nth-child(1)");
	static By  mobSonyXperiaImage=By.cssSelector("#product-collection-image-1");
	static By  mobSonyXpheriaAddToCart=By.cssSelector(".item:nth-child(1) .actions span > span");
	static By  mobSelectBox=By.cssSelector(".category-products > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > select");

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


	public static WebElement sonyXpheriaAddToCart(WebDriver driver)
	{
		System.out.println("In mobile page,Adding  Sony Xpheria to cart");
		return driver.findElement(mobSonyXpheriaAddToCart);
	}
	
	public static WebElement getMobSelectBox(WebDriver driver)
	{
		System.out.println("In mobile page , retrieveing NAme from SElect box");
		return driver.findElement(mobSelectBox);
	}
	}

	