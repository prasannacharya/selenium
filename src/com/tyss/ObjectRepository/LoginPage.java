
package com.tyss.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	WebDriver driver;

	@FindBy(name="email")
	private WebElement userNameEB;
	
	@FindBy(name="password")
	private WebElement passwordEB;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//a[text()='Create Account']")
	private WebElement CreteAccont;

	@FindBy(id="male")
	private WebElement gender;
	
	@FindBy(xpath="//button[text()='REGISTER']")
	private WebElement Rigister;
	
	@FindBy(name="mobile")
	private  WebElement MobileNo;
	
	public WebElement getUserNameEB() 
	{
		return userNameEB;
	}

	public WebElement getPasswordEB() 
	{
		return passwordEB;
	}

	public WebElement getLoginBtn() 
	{
		return loginBtn;
	}
	public WebElement NewAcount()
	{
		return CreteAccont;
	}
	
	public WebElement Gender()
	{
		return gender;
	}
	
	public WebElement Rigistration()
	{
		return Rigister;
	}
	
	public WebElement MobileNo()
	{
		return MobileNo;
	}
	public void login(String Email, String password)
	{
		userNameEB.sendKeys(Email);
		passwordEB.sendKeys(password);
		loginBtn.click();
	}
	public void createAccount(String mail, String pswd, String MbNo)
	{
		CreteAccont.click();
		userNameEB.sendKeys(mail);
		passwordEB.sendKeys(pswd);
		MobileNo.sendKeys(MbNo);
		gender.click();
		Rigister.click();
	}
	
}
