package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingMobilePageObjects {
static By  mobSelectBox=By.cssSelector(".category-products > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > select");

public static WebElement getMobSelectBox(WebDriver driver)
{
	System.out.println("In mobile page , retrieveing NAme from SElect box");
	return driver.findElement(mobSelectBox);
}
}
