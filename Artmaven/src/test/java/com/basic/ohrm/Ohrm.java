package com.basic.ohrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Ohrm {
 public WebDriver driver;

	public void openApp(String brwname,String applicationurl) {
		 driver=browserName(brwname);
		 driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		 driver.get(applicationurl);
		 driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
	  	   
	  	 }
	public static WebDriver browserName(String brname) {
		WebDriver driver;
		switch (brname) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
	  		driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Drivers\\geckodriver-v0.18.0-win64\\geckodriver.exe");
	  		driver = new FirefoxDriver();
	  		break;
		default:
			System.setProperty("webdriver.ie.driver","D:\\Selenium\\Drivers\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		}
		return driver;
	}

	public void loginPage() {
	
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		  driver.findElement(By.id("txtPassword")).sendKeys("admin");
		  driver.findElement(By.id("btnLogin")).click();
	}
	
	
	
	public void quitBr() {
		driver.quit();
	}
}
