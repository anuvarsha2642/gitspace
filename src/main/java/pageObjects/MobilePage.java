package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MobilePage {
	static By  mobSonyXperiaPrice=By.cssSelector("#product-price-1 > span:nth-child(1)");
	static By  mobSonyXperiaImage=By.cssSelector("#product-collection-image-1");
	static By  mobSonyXpheriaAddToCart=By.cssSelector(".item:nth-child(1) .actions span > span");
	static By  mobSelectBox=By.cssSelector(".category-products > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > select");
	static By  mobSonyXpheriaCompareBox=By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a");
	static By mobIphoneCompareBox=By.cssSelector(".item:nth-child(2) .link-compare");
	static By compareButton=By.cssSelector(".block-content:nth-child(2) span > span");
	
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
	public static WebElement addSonyxpheriaToCompare(WebDriver driver)
	{
		System.out.println("In mobile page,Adding SonyXPheria to compare");
		return driver.findElement(mobSonyXpheriaCompareBox);
	}
	public static WebElement addIphoneToComapre(WebDriver driver)
	{
		System.out.println("In mobile page,Adding Iphone to compare");
		return driver.findElement(mobIphoneCompareBox);
	}
	public static WebElement getCompareButton(WebDriver driver)
	{
		System.out.println("In mobile page,Clicking the compare button");
		return driver.findElement(compareButton);
	}
	}

	