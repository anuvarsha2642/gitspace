package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkoutPage {

	static By  statusShoppingCart=By.cssSelector(".product-cart-info>.item-msg");

	
	public static WebElement getstatusShoppingCart(WebDriver driver)
		{
			System.out.println("In checkout page , retrieveing status of shopping cart");
			return driver.findElement(statusShoppingCart);
		}
		
}
