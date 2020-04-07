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
import com.tyss.ObjectRepository.ProfilePage;

public class HomeProductTest extends Base{
	public HomePage lp;
	public LoginPage hp;
	ProfilePage pg;
	FileLib lb=new FileLib();
	Utility ut=new Utility();

	@Test
	public void upDateProductTest()
	{
		String url="https://www.myntra.com/";
		String title ="Online Shopping";
		String wish="WISHLISTED";
		String pduct="Product Details";
		String WishlistScreen="Wishlist";
		String PageName="Boys Sports Shoes";
	    boolean result=driver.getTitle().contains(title);
	   Assert.assertTrue(result);
	   lp=PageFactory.initElements(driver, HomePage.class);
	Assert.assertEquals(driver.getCurrentUrl(), url);
	Reporter.log("application is launched",true);
    Reporter.log("Home screen is displayed",true);
    Actions act=new Actions(driver);
    act.moveToElement(lp.homeLiving()).perform();
    Reporter.log(lp.homeLiving().getText()+" category is displayed", true);
    WebDriverWait wait=new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.elementToBeClickable(lp.clock()));
      ut.moveToElement(driver, lp.clock());
      Point loc = lp.clockType().getLocation();
      int x=loc.getX();
      int y=loc.getY();
      JavascriptExecutor script=(JavascriptExecutor)driver;
      script.executeScript("window.scroll("+x+","+y+")");
	}
	
	
}
