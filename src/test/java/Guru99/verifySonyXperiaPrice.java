package Guru99;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.magentoHomePage;
import pageObjects.mobileSonyXpheria;
import utils.base;

public class verifySonyXperiaPrice extends base{
	mobileSonyXpheria msx=new mobileSonyXpheria();
	@BeforeTest
	public static void launchingBrowser() throws IOException
	{
	driver=initialiseBrowser(driver,"Chrome");
	driver.get(prop.getProperty("magentoMobUrl"));
	}
	@Test
	public void RetrieveSonyXperiaPrice()
	{
		WebElement sonyXperiaPrice=msx.getmobSonyXperiaPrice(driver);
	
	String priceInMobPage=sonyXperiaPrice.getText();
	
		
		
	}
}
