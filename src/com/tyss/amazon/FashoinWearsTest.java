package com.tyss.amazon;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.amazon.genericLib.Base;
import com.amazon.genericLib.FileLib;
import com.amazon.genericLib.Utility;
import com.tyss.ObjectRepository.HomePage;
import com.tyss.ObjectRepository.LoginPage;

public class FashoinWearsTest extends Base {
	public HomePage lp;
	public LoginPage hp;
	FileLib lb=new FileLib();
	Utility ut=new Utility();
	@Test
	public void RemoveFromWishlist()
	{
			String url="https://www.myntra.com/";
			String title ="Online Shopping";
			String Search="Tshirt - Buy Tshirt online in India";
			String wish="WISHLISTED";
			String WishlistScreen="Wishlist";
			String Log="Login";
		    boolean result=driver.getTitle().contains(title);
		   Assert.assertTrue(result);
		   lp=PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(driver.getCurrentUrl(), url);
		Reporter.log("application is launched",true);
	    Reporter.log("Home screen is displayed",true);
	    ut.moveToElement(driver, lp.wishlist());
	    Assert.assertEquals(driver.getTitle(), WishlistScreen);
	    Reporter.log(driver.getTitle()+" page is displayed",true);
	    lp.lgin().click();
	    Assert.assertEquals(driver.getTitle(), Log);
	    Reporter.log(driver.getTitle()+" page is displayed",true);
	    hp=PageFactory.initElements(driver, LoginPage.class);
		hp.login("prasannaachar126@gmail.com", "Prasan#1");
		lp.continueshop().click();
		Actions act=new Actions(driver);
		act.moveToElement(lp.menShop()).perform();
	    ut.moveToElement(driver, lp.jacket());
	    Point loc = lp.items().getLocation();
	    int x=loc.getX();
	    int y= loc.getY();
	    JavascriptExecutor script=(JavascriptExecutor)driver;
	    script.executeScript("window.scroll("+x+","+y+")");
	    WebDriverWait wait1=new WebDriverWait(driver, 10);
	    wait1.until(ExpectedConditions.elementToBeSelected(lp.items()));
	    lp.items().click();
	    

	}
}
