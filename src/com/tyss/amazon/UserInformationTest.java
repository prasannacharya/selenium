package com.tyss.amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.amazon.genericLib.Base;
import com.amazon.genericLib.FileLib;
import com.amazon.genericLib.Utility;
import com.tyss.ObjectRepository.AddressPage;
import com.tyss.ObjectRepository.HomePage;
import com.tyss.ObjectRepository.LoginPage;
import com.tyss.ObjectRepository.ProfilePage;

public class UserInformationTest extends Base {

	public HomePage lp;
	public LoginPage hp;
	FileLib lb = new FileLib();
	Utility ut = new Utility();
	ProfilePage pg=new ProfilePage();
	AddressPage ap;
	@Test
	public void EditAddressTest()  {
		String url="https://www.myntra.com/";
		String title ="Online Shopping";
		String pPage="Profile";
		String wish="WISHLISTED";
		String WishlistScreen="Wishlist";
		String login="Login";
		String add="Address";
	    boolean result=driver.getTitle().contains(title);
	   Assert.assertTrue(result);
	   lp=PageFactory.initElements(driver, HomePage.class);
	Assert.assertEquals(driver.getCurrentUrl(), url);
	Reporter.log("application is launched",true);
    Reporter.log("Home screen is displayed",true);	
    ut.moveToElement(driver, lp.profile());
	pg=PageFactory.initElements(driver, ProfilePage.class);
	pg.log().click();
	hp=PageFactory.initElements(driver, LoginPage.class);
	Assert.assertEquals(driver.getTitle(), login);
	Reporter.log(driver.getTitle()+" page is displayed ", true);
	hp.login("prasannaachar126@gmail.com", "Prasan#1");
	lp.logo().click();
	ut.moveToElement(driver, lp.profile());
	WebDriverWait wait1=new WebDriverWait(driver, 10);
	wait1.until(ExpectedConditions.elementToBeClickable(pg.mail()));
	pg.mail().click();
	Assert.assertEquals(driver.getTitle(), pPage);
    Reporter.log(driver.getTitle()+" page is displayed",true);	
   ut.moveToElement(driver, pg.address());
   Assert.assertEquals(driver.getTitle(), add);
  Reporter.log(driver.getTitle()+" page is displayed",true);
  pg.addres().click();
  ap=PageFactory.initElements(driver, AddressPage.class);
    ap.CreateAdd("prasanna", "7022912986", "576223","mandarthi,12,kadoor,Bayarbettu");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    Point loc = ap.city().getLocation();
    int x=loc.getX();
	int y=loc.getY();
	JavascriptExecutor script=(JavascriptExecutor)driver;
	   script.executeScript("window.scroll("+x+","+y+")");
  WebDriverWait wait=new WebDriverWait(driver, 15);
  wait.until(ExpectedConditions.elementToBeClickable(ap.locality()));
    ap.locality().click();
	ap.check().click();
	ap.cnfrm().click();
	ap.checkBox().click();
	ap.savebtn().click();
	Reporter.log("Address sucessfully added",true);

	}
}