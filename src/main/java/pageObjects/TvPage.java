package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TvPage {
	static By  tvTab=By.xpath("//*[@id=\"nav\"]/ol/li[2]/a");
	static By  addToWishList=By.linkText("Add to Wishlist");
	
	public static WebElement getAddToWishListTab(WebDriver driver)
		{
			System.out.println("In Tv page , retrieveing add to wishlist tab");
			return driver.findElement(addToWishList);
		}
	
	public static WebElement getTvTab(WebDriver driver)
		{
			System.out.println("In Registration page , retrieveing firstNameTab");
			return driver.findElement(tvTab);
		}
}
