package com.basic.ohrm;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginOhrm {
	public static WebDriver driver;
	static Ohrm obj=new Ohrm();;
	
	  @BeforeClass
	  @Parameters({"browsertype","appurl"})
	  public static void openApplication(String browsertype, String appurl) {
			obj.openApp(browsertype, appurl);
			} 	
	
  @Test
  public static void login() {
	  obj.loginPage();	  
  }
  
 
@AfterClass
public static void quit()
{
	System.out.println("close the browser");
	obj.quitBr();
}
  
}
