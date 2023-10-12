package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utilities.PropertiesUtils;

public class BaseClass 
{
	public static WebDriver driver=null;
	
	public void initialization()
	{
		
		String browsername=PropertiesUtils.readproperty("browser");
		if (browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(PropertiesUtils.readproperty("url"));
	}

}
