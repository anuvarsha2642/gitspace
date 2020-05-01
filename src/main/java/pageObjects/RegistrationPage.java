package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

	static By  firstNameTab=By.id("firstname");
	static By  middlenameTab=By.id("middlename");
	static By  lastnameTab=By.id("lastname");		
	static By  emailAddressTab=By.id("email_address");		
	static By  passwordTab=By.id("password");		
	static By  confirmationPasswordTab=By.id("confirmation");		
	static By  submitButton=By.cssSelector(".button:nth-child(2)");
	static By  msgRegistrationConfirmation=By.cssSelector("li > span");
	
	public static WebElement getFirstNameTab(WebDriver driver)
		{
			System.out.println("In Registration page , retrieveing firstNameTab");
			return driver.findElement(firstNameTab);
		}
	public static WebElement getMiddleNameTab(WebDriver driver)
	{
	
		System.out.println("In Registration page , retrieveing middlenameTab");
		return driver.findElement(middlenameTab);
	}
	public static WebElement getlastnameTab(WebDriver driver)
	{
		System.out.println("In Registration page , retrieveing lastnameTab");
		return driver.findElement(lastnameTab);
	}
	public static WebElement getEmailAddressTab(WebDriver driver)
	{
		System.out.println("In Registration page , retrieveing emailAddressTab");
		return driver.findElement(emailAddressTab);
		
	}
	public static WebElement getPasswordTab(WebDriver driver)
	{
		System.out.println("In Registration page , retrieveing passwordTab");
		return driver.findElement(passwordTab);
	}	
		public static WebElement getConfirmationPasswordTab(WebDriver driver)
	{
		System.out.println("In Registration page , retrieveing confirmationPasswordTab");
		return driver.findElement(confirmationPasswordTab);
	}
	public static WebElement getSubmitButton(WebDriver driver)
	{
		System.out.println("In checkout page , retrieveing submitButton");
		return driver.findElement(submitButton);
	}
	public static WebElement getMsgRegistrationConfirmation(WebDriver driver)
	{
		System.out.println("After Registration ,retrieving success message");
		return driver.findElement(msgRegistrationConfirmation);
	}
		
}






		
