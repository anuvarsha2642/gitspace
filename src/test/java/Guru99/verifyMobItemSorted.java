package Guru99;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.landingMobilePageObjects;
import pageObjects.magentoHomePage;
import utils.base;
//so this project is from guru99 site. Its very helpful.
public class verifyMobItemSorted extends base{
	magentoHomePage mhp=new magentoHomePage();
	
	@BeforeTest
	public static void launchingBrowser() throws IOException
	{
	driver=initialiseBrowser(driver,"Chrome");
	driver.get(prop.getProperty("magentoUrl"));	
	}
	@Test
	public void verifyMagentoTitlePage()
	{
		Assert.assertEquals(prop.getProperty("expectedMagentoPageTitle"), driver.getTitle());
		//Assert.assertTrue(prop.getProperty("expectedMobPageTitle").equals(driver.getTitle()));
	}

	@Test (priority=1)
	public void verifyMobTitlePage() throws InterruptedException
	{
		WebElement mobLink=mhp.getmobLink(driver);
		mobLink.click();
		Thread.sleep(1000);
		Assert.assertEquals(prop.getProperty("expectedMobPageTitle"), driver.getTitle());
		//Assert.assertTrue("expectedMobPageTitle".equals(driver.getTitle()));
		
		
	}
	@Test(priority=2)
	public void verifyItemInMobList() throws IOException
	{
		String downloadPath=System.getProperty("user.dir");
		System.out.println("Trying to invoke NAme from select box");
		//WebElement mobSelectBox=landingMobilePageObjects.getMobSelectBox(driver);
		Select select= new Select(driver.findElement(By.cssSelector("select[title=\"Sort By\"]")));
		select.selectByVisibleText("Name");
		
	//	select.selectByVisibleText("Name");
		List<WebElement> listOfItems=driver.findElements(By.className("product-name"));
		ArrayList<String> obtainedList = new ArrayList<String>(); 
		for(WebElement we:listOfItems){
		System.out.println(we.getText());
			obtainedList.add(we.getText());
		 
		}
		ArrayList<String> sortedList = new ArrayList<String>();   
		for(String s:obtainedList){
			sortedList.add(s);
		}
		Collections.sort(sortedList);
		for(String re:sortedList)
		{
			System.out.println(re);
		}
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File(downloadPath+"/screenshot.png"));
		Assert.assertTrue(sortedList.equals(obtainedList));
	}
	}

