package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MagentoPage {
static By  mobLink=By.xpath("//a[contains(text(),'Mobile')]");
static By  accountTab=By.cssSelector(".skip-account > .label");
static By  registerTab=By.linkText("Register");

public static WebElement getAccountTab(WebDriver driver)
{
	System.out.println("In Home page , retrieveing account tab");
	return driver.findElement(accountTab);
}
public static WebElement getRegisterTab(WebDriver driver)
{
	System.out.println("In Home page , retrieveing register tab");
	return driver.findElement(registerTab);
}

public static WebElement getmobLink(WebDriver driver)
{
	System.out.println("In Magento page ,moving to mobile page");
	return driver.findElement(mobLink);	
}

}
