package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class magentoHomePage {
static By  mobLink=By.xpath("//a[contains(text(),'Mobile')]");

public static WebElement getmobLink(WebDriver driver)
{
	System.out.println("In Magento page ,moving to mobile page");
	return driver.findElement(mobLink);	
}

}
