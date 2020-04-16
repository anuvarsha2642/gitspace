package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SonyXpheria {
static By  quantitySelectBox=By.xpath("//input[@title='Qty']");
static By addToCart=By.cssSelector(".btn-cart");
static By updateCart=By.xpath("//button[@title='Update']");
static By  emptyCart=By.xpath("//*[@id=\"empty_cart_button\"]/span/span");
static By errorOverCapacityMsg=By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/div/ul/li/ul/li/span");

public static WebElement getquantitySelectBox(WebDriver driver)
{
	System.out.println("In mobile page , retrieveing NAme from SElect box");
	return driver.findElement(quantitySelectBox );
}
public static WebElement emptyCart(WebDriver driver)
{
	System.out.println("In mobile page , Emptying cart");
	return driver.findElement(emptyCart);
}
public static WebElement updateCart(WebDriver driver)
{
	System.out.println("In mobile page , Emptying cart");
	return driver.findElement(updateCart);
}
public static WebElement addToCart(WebDriver driver)
{
	System.out.println("In SonyXpheria page , adding into  cart");
	return driver.findElement(addToCart);
}
public static WebElement getErrorMsg(WebDriver driver)
{
	System.out.println("In SonyXpheria page , displaying error over capacity msg");
	return driver.findElement(errorOverCapacityMsg);
}
}
