package Guru99;

import java.io.IOException;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.MagentoPage;
import pageObjects.RegistrationPage;
import pageObjects.TvPage;
import pageObjects.shareWishListPage;
import utils.base;

public class verifyAccountCreation extends base {
	
	RegistrationPage rp=new RegistrationPage();
	MagentoPage mp=new MagentoPage();
	TvPage tvp=new TvPage();
	shareWishListPage swp=new shareWishListPage();
	@BeforeClass
	//Go to URL
	public static void launchingBrowser() throws IOException
	{
		System.out.println("Launching browser in verify account creation testcase");
	driver=initialiseBrowser(driver);
	driver.get(prop.getProperty("magentoUrl"));	
	System.out.println("In verifyMobitemsorted");
	}
@Test
//2.Click Account Tab
public void creatingNewAccount()
{
	System.out.println("In creating New account");
	mp.getAccountTab(driver).click();
	mp.getRegisterTab(driver).click();
	

}
@Test(priority=1)
//3.Registering new user
public void registeringNewUser() throws InterruptedException
{
	System.out.println("registeringNewUser" );
	Random randomGenerator = new Random();  
	int randomInt = randomGenerator.nextInt(1000);   
	Thread.sleep(1000);
	rp.getFirstNameTab(driver).clear();
	rp.getFirstNameTab(driver).sendKeys("anuvarsha");
	rp.getlastnameTab(driver).clear();
	rp.getlastnameTab(driver).sendKeys("shaam");
	System.out.println("username"+ randomInt +"@gmail.com");
	rp.getEmailAddressTab(driver).sendKeys("username"+ randomInt +"@gmail.com");
	rp.getPasswordTab(driver).sendKeys("happyy");
	rp.getConfirmationPasswordTab(driver).clear();
	rp.getConfirmationPasswordTab(driver).sendKeys("happyy");
	rp.getSubmitButton(driver).click();
	String actualConfirmationMsg=rp.getMsgRegistrationConfirmation(driver).getText();
	try {
		Assert.assertEquals("Thank you for registering with Main Website Store.", actualConfirmationMsg);			
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
@Test(dependsOnMethods={"registeringNewUser"})
//4.Going to TV page , Adding it to wish list
public void   addingTvToWishlist()
{
	WebDriverWait wait=new WebDriverWait(driver, 20);
	System.out.println("In tv page");
	tvp.getTvTab(driver).click();
	tvp.getAddToWishListTab(driver).click();
	swp.getButtonShareWishList(driver).click();
	swp.getEmailAddressTextBox(driver).clear();
	swp.getEmailAddressTextBox(driver).sendKeys("wishwisho@gmail.com");
	swp.getMessageTextBox(driver).clear();
	swp.getMessageTextBox(driver).sendKeys("Hi can you please check this");
	wait.until(ExpectedConditions.visibilityOf(swp.getshareWishListButton(driver))).click();
	try {
		Assert.assertEquals("Your Wishlist has been shared.", swp.getshareWishListSuccessMsg(driver).getText());			
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	    driver.close();        
	
}


}