package Guru99;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.SonyXpheria;
import pageObjects.checkoutPage;
import utils.base;

public class verifySonyXpheriaQuantity extends base {

	SonyXpheria sxp=new SonyXpheria();
	checkoutPage cp= new checkoutPage();
	@Test
	public void verifyingQuantityOverCapacity()
	{
		System.out.println("In sonyxpheria testcase to verify the quantity");

		WebElement addToCart=sxp.addToCart(driver);
		addToCart.click();
		WebElement enteringQuantity=sxp.getquantitySelectBox(driver);
		enteringQuantity.sendKeys("1000");
		sxp.updateCart(driver).click();
		String errorMsg=cp.getstatusShoppingCart(driver).getText();
		System.out.println("The error msg obtainetd is "+errorMsg);
		Assert.assertEquals("* The maximum quantity allowed for purchase is 500.",errorMsg);
		
	}
	
}
