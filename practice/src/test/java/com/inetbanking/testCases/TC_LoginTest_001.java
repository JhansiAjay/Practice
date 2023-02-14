package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

public class TC_LoginTest_001 extends BaseClass
{
@Test	
public void loginTest()
{
	driver.get(baseURL);
	logger.info("URL is Opened");
	
	
	LoginPage lp=new LoginPage(driver);
	lp.setUserName(username);
	logger.info("Entered username");
	
	lp.setPassword(password);
	logger.info("Entered password");
	
	lp.clickSumit();
	
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	{
		Assert.assertTrue(true);
		logger.info("Login test passed");
	}
		else
		{
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}
}

