package com.inetbanking.testCases;

import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseURL="https://demo.guru99.com/v4/";
	public String username="mngr477720";	
	public String password="EvAvujE";
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setup()
	{
		logger=Logger.getLogger("BaseClass");
	    DOMConfigurator.configure("C:\\Users\\shamim\\eclipse-workspace\\practice\\log4j\\log4j.xml");
	    
		System.setProperty("wedriver.chrome.driver",System.getProperty("user.dir")+"//Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    
	    
	    
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
  