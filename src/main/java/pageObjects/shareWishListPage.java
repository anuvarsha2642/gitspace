package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class shareWishListPage {
	static By  buttonShareWishList=By.cssSelector(".btn-share");
	static By  emailAddressTextBox=By.id("email_address");
	static By  messageTextBox=By.id("message");
	static By  shareWishListButton=By.xpath("//button[@title='Share Wishlist']");
	static By  shareWishListSuccessMsg=By.cssSelector("li > span");
	
	public static WebElement getButtonShareWishList(WebDriver driver)
		{
			System.out.println("In sharewishlist page , retrieving sharewish list button");
			return driver.findElement(buttonShareWishList);
		}
	public static WebElement getEmailAddressTextBox(WebDriver driver)
	{
		System.out.println("In sharewish list page page , get email address text box");
		return driver.findElement(emailAddressTextBox);
	}
	public static WebElement getMessageTextBox(WebDriver driver)
	{
		System.out.println("In sharewish list page page , get message text box");
		return driver.findElement(messageTextBox);
	}
	public static WebElement getshareWishListButton(WebDriver driver)
	{
		System.out.println("In sharewish list page page , get share wishlist button");
		return driver.findElement(shareWishListButton);
	}
	public static WebElement getshareWishListSuccessMsg(WebDriver driver)
	{
		System.out.println("In sharewish list page page , getting  wishlist success message");
		return driver.findElement(shareWishListSuccessMsg);
	}
	
	
	
	
}
