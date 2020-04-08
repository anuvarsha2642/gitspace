package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//base class initialises the webdriver
public class base {
public static Properties prop;
public static WebDriver driver;
	
public static WebDriver initialiseBrowser(WebDriver driver,String browsername) throws IOException
{
	prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\anuva\\Downloads\\MagentoProject\\config.properties");
	prop.load(fis);
	if(browsername.equalsIgnoreCase("Chrome"))
	{
		/*String downloadPath=System.getProperty("user.dir");
		HashMap<String,Object> chromePrefs=new HashMap<String,Object>();
		chromePrefs.put("profile.default_content_settings.popups",0);
		chromePrefs.put("download.default_directory",downloadPath);
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);*/
		System.setProperty("webdriver.chrome.driver",prop.getProperty("chromeLocation"));
		driver=new ChromeDriver();
	}
	else if(browsername=="IE")
	{
		System.setProperty("webdriver.ie.driver", prop.getProperty("IElocation"));
		 driver = new InternetExplorerDriver();
	}
	else if(browsername=="firefox")
	{
		System.setProperty("webdriver.gecko.driver",prop.getProperty("Firefoxlocation"));
		 driver = new FirefoxDriver();
	}
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	return driver;
	
	
}
}