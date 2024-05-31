package com.orange.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement usn;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement psw;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement lgn;
	
	public loginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement Enterusn()
	{
		return usn;
	}
	public WebElement Enterpsw()
	{
		return psw;
	}
	public WebElement Clklgn()
	{
		return lgn;
	}
	
   
}
