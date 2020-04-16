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
	public void verifyingQuantityOverCapacity() throws InterruptedException
	{
		System.out.println("In sonyxpheria testcase to verify the quantity");

		WebElement addToCart=sxp.addToCart(driver);
		addToCart.click();
		WebElement enteringQuantity=sxp.getquantitySelectBox(driver);
		enteringQuantity.sendKeys("1000");
		sxp.updateCart(driver).click();
		Thread.sleep(1000);
		String errorMsg=sxp.getErrorMsg(driver).getText();		
		System.out.println("The error msg obtainetd is "+errorMsg);
		Assert.assertEquals("Some of the products cannot be ordered in requested quantity.",errorMsg);
		sxp.emptyCart(driver).click();
		String emptyShoppingCart=cp.getstatusShoppingCart(driver).getText();
		System.out.println("The error msg for cart obtainetd is "+emptyShoppingCart);
		
		Assert.assertEquals("SHOPPING CART IS EMPTY",emptyShoppingCart);
		
		
		
	}
	
}
