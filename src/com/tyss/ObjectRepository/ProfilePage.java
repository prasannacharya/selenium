package com.tyss.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {
@FindBy(xpath="//div[text()=' Edit Profile ']")
private WebElement profile;

@FindBy(name="firstName")
private WebElement fname;

@FindBy(name="lastName")
private WebElement lname;


@FindBy(name="dob")
private WebElement dateofbirth;

@FindBy(name="bio")
private WebElement bio;


@FindBy(name="location")
private WebElement loc;

@FindBy(xpath="//div[text()=' Confirm']")
private WebElement cnfirm;

@FindBy(xpath="//a[text()='log in']")
private WebElement login;

@FindBy(xpath="//div[@class='desktop-infoTitle']")
private WebElement gmail;

@FindBy(xpath="//a[text()='Addresses']")
private WebElement adrs;

@FindBy(xpath="//div[text()=' + Add New Address ']")
private WebElement adrss;

public WebElement addres()
{
	return adrss;
}

public WebElement address()
{
	return adrs;
}


public WebElement mail()
{
	return gmail;
}
public WebElement log()
{
	return login;
}

public WebElement cnfbutn()
{
	return cnfirm;
}
public WebElement location()
{
	return loc;
}

public WebElement details()
{
	return bio;
}
public WebElement date()
{
	return dateofbirth;
}

public WebElement lname()
{
	return lname;
}

public WebElement fname()
{
	return fname;
}

public WebElement profiles()
{
	return profile;
}

public void generalDetails(String Fname,String Lname, String Dob,String Bio, String Location)
{
	profile.click();
	fname.sendKeys(Fname);
	lname.sendKeys(Lname);
	dateofbirth.sendKeys(Dob);
	bio.sendKeys(Bio);
	loc.sendKeys(Location);
	cnfirm.click();
	
	
}

}
