package Guru99;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.MobilePage;
import pageObjects.MobilePopUpWindow;
import pageObjects.SonyXpheria;
import pageObjects.checkoutPage;
import utils.base;

public class verifyTwoMobileToCompare extends base {

	MobilePage mp=new MobilePage();
	MobilePopUpWindow mpw= new MobilePopUpWindow();
	@BeforeTest
	//// 1. Go to mobile menu http://live.demoguru99.com/
	public static void launchingBrowser() throws IOException
	{
	driver=initialiseBrowser(driver,"Chrome");
	driver.get("http://live.demoguru99.com/index.php/mobile.html");
	System.out.println("In verifyTwoMobileToCompare");
	}
	@Test
    // 3. In mobile products list , click on ‘Add To Compare’ for 2 mobiles (Iphone &SamsungGalaxy)
	public void addingmobilesToCompare() throws InterruptedException, IOException
	{
		
	
		System.out.println("In mobile page , to verify ifTwo mobilescan be compared");
		
		mp.addSonyxpheriaToCompare(driver).click();
		mp.addIphoneToComapre(driver).click();
		  // 4. Click on ‘COMPARE’ button. A popup window opens
		mp.getCompareButton(driver).click();
		Thread.sleep(1000);
		//Handling new window
		Set<String> handle = driver.getWindowHandles();
		 Iterator iterator =handle.iterator();
		 String parentWindowId=(String) iterator.next();
		 System.out.println("parent "+parentWindowId);
		 String childWindowId=(String) iterator.next();
		 System.out.println("child "+childWindowId);
			
		 driver.switchTo().window(childWindowId);
		 Thread.sleep(1000);
		 String samsungText=mpw.getSamsungGalaxy(driver).getText();
		 System.out.println("samsungtextname"+samsungText);
		 try {
			Assert.assertEquals("SAMSUNG GALAXY",samsungText);
					
			}
		catch(Exception e)
			{
				e.printStackTrace();
			}
		String IphoneText=mpw.getIphonePresenceInPopUpWindow(driver).getText();
		System.out.println("Ipone name"+IphoneText);
		
	
		try {
			Assert.assertEquals("IPHONE",IphoneText);
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		driver.close();
		driver.switchTo().window(parentWindowId).close();
		driver.quit();
	}
		
}
