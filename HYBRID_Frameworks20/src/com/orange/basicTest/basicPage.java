package com.orange.basicTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.orange.PageObjects.loginPage;

public class basicPage implements Application_constants {
	public WebDriver driver;
	public Properties pro;
	public loginPage pl;
	@BeforeClass
	public void login() throws IOException
	{
		 System.setProperty(c_key, c_value);
		 driver=new ChromeDriver();
		 pl=new loginPage(driver);
		 pro = new Properties();
		 FileInputStream fis = new FileInputStream("./property/data.properties");
		 pro.load(fis);
		 driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
         driver.get(pro.getProperty("url"));
        
	
	
		
        pl.Enterusn().sendKeys(pro.getProperty("usn1"));
        pl.Enterpsw().sendKeys(pro.getProperty("psw1"));
        pl.Clklgn().click();
        
		
	}
}
