package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//base class initialises the webdriver
public class base {
public static Properties prop;
public static WebDriver driver;
	
public static WebDriver initialiseBrowser(WebDriver driver) throws IOException
{
	prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\anuva\\Downloads\\MagentoProject\\config.properties");
	prop.load(fis);
	String browsername=System.getProperty("browser");
	
	//String browsername="IE";
	System.out.println(browsername);
	if(browsername.equalsIgnoreCase("chrome"))
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
	else if(browsername.equalsIgnoreCase("IE"))
	{
		System.out.println("In Internet Explorer");
		System.setProperty("webdriver.ie.driver", "C:\\\\Users\\\\anuva\\\\Downloads\\\\Browserexe\\\\IEDriverServer_x64_2.48.0\\\\IEDriverServer.exe");
		 driver = new InternetExplorerDriver();
	}
	else if(browsername.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\anuva\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		 driver = new FirefoxDriver();
	}
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	return driver;
	
	
}
public void getScreenShotOnFailure(String name) throws IOException
{

	String downloadPath=System.getProperty("user.dir");
	System.out.println(name);
	System.out.println("The download path is" +downloadPath);
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File(downloadPath+"\\"+name+"screenshot.png"));
}
 
}