package Guru99;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
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
		enteringQuantity.clear();
		enteringQuantity.sendKeys("1000");
		sxp.updateCart(driver).click();
		Thread.sleep(1000);
		String errorMsg=sxp.getErrorMsg(driver).getText();		
		System.out.println("The error msg obtainetd is "+errorMsg);
		try {
			Assert.assertEquals("* The maximum quantity allowed for purchase is 500.",errorMsg);
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		sxp.emptyCart(driver).click();
		Thread.sleep(1000);
		String emptyShoppingCart=checkoutPage.getstatusShoppingCart(driver).getText();
		System.out.println("The error msg for cart obtainetd is "+emptyShoppingCart);
		try {
			Assert.assertEquals("SHOPPING CART IS EMPTY",emptyShoppingCart);
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		cp.getMobLink(driver).click();
		//driver.close();
		
		
	}
	
	
}
