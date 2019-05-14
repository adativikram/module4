package com.src.modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modules {
	public static WebDriver driver;
	static String browser;
	public static void setBrowser() {
		PropertiesFile.readProperties();
		browser=PropertiesFile.prop.getProperty("browser");
	}
	public static void setBrowserConfig() {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram sagar\\eclipse-workspace\\moduleTest4\\chromedriver.exe");
		}
	}
	public static void runTest() {
		driver=new ChromeDriver();
		driver.get(PropertiesFile.prop.getProperty("url"));		
	}
	public static void endTest() {
		driver.quit();
		
	}
}
