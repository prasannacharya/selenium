package com.tyss.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage {
	
	WebDriver driver;
@FindBy(name="name")
private WebElement nme;

@FindBy(name="mobile")
private WebElement mbo;

@FindBy(name="pincode")
private WebElement pin;

@FindBy(name="state")
private WebElement ste;

@FindBy(name="address")
private WebElement add;

@FindBy(name="locality")
private WebElement loclity;

@FindBy(name="city")
private WebElement cty;

@FindBy(id="Home")
private WebElement homec;

@FindBy(xpath="//div[text()='Save']")
private WebElement save;


@FindBy(id="Mandarthi")
private WebElement cke;

@FindBy(xpath="//div[text()='Confirm']")
private WebElement cnfirm;

public WebElement cnfrm()
{
	return cnfirm;
}

public WebElement check()
{
	return cke;
}

public WebElement savebtn()
{
	return save;
}
public WebElement checkBox()
{
	return homec;
	
}

public WebElement city()
{
	return cty;
}

public WebElement locality()
{
	return loclity;
}

public WebElement address()
{
	return add;
}

public WebElement state()
{
	return ste;
}

public WebElement pcode()
{
	return pin;
}

public WebElement mno()
{
	return mbo;
}

public WebElement fname()
{
return nme;	
}
public void CreateAdd(String name,String mobileno,String pincode,String address)
{
	
	nme.sendKeys(name);
	mbo.sendKeys(mobileno);
	pin.sendKeys(pincode);
	add.sendKeys(address);
	
}

}
