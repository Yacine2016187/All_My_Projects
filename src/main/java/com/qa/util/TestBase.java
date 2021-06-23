package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		
		try {
			prop=new Properties();
			FileInputStream fis= new FileInputStream("C:\\Users\\Yacine\\Desktop\\CucumberSeleniumFramework-master\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();		}
		
	}
	public static void  initialization() {
		String browsernameString=prop.getProperty("browser");
		
		if (browsernameString.equals("chrome")) {
			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Yacine\\Desktop\\CucumberSeleniumFramework-master\\Driver2\\91.exe");
			driver=new ChromeDriver();
			
		}else{
			System.out.println("Please enter a valid Browser ");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
			
		
	}
}
