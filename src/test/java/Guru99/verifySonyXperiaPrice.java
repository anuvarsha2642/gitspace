package Guru99;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.magentoHomePage;
import pageObjects.mobileSonyXpheria;
import pageObjects.sonyXpheriaPage;
import utils.base;

public class verifySonyXperiaPrice extends base{
	mobileSonyXpheria msx=new mobileSonyXpheria();
	sonyXpheriaPage sx=new sonyXpheriaPage(); 

	@Test
	public void RetrieveSonyXperiaPrice()
	{
		WebElement sonyXperiaPrice=msx.getmobSonyXperiaPrice(driver);
	
		String priceInMobPage=sonyXperiaPrice.getText();
	//	System.out.println("price in mobxperiapage"+priceInMobPage);
		WebElement sonyXperiaImage=msx.getmobSonyXperiaImage(driver);
		sonyXperiaImage.click();
		WebElement xperiaPrice=sx.getSonyXperiaPrice(driver);
		String priceInXperiaPage=xperiaPrice.getText();
		//System.out.println("price in sonyxperiapage"+priceInXperiaPage);
		Assert.assertEquals("Prices not Matching",priceInMobPage, priceInXperiaPage);
		driver.close();
	}
	
		
	}
