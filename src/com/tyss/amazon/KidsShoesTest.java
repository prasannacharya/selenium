package com.tyss.amazon;

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

public class KidsShoesTest extends Base {
	public HomePage lp;
	public LoginPage hp;
	ProfilePage pg;
	FileLib lb=new FileLib();
	Utility ut=new Utility();
	@Test
	public void AddToCartTest()
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
    act.moveToElement(lp.kids()).perform();
    Reporter.log(lp.kids().getText()+" category is displayed", true);
    WebDriverWait wait=new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.elementToBeClickable(lp.shoes()));
      ut.moveToElement(driver, lp.shoes());
      boolean Page=driver.getTitle().contains(PageName);
	   Assert.assertTrue(Page);
	   Reporter.log("Shoes list is displayed",true);
      lp.prduct().click();
      ut.switchToNewWindow(driver);
      lp.Length().click();
      Reporter.log("SizeChart popup is displayed",true);
      lp.cBox().click();
      lp.list().click();
	   hp=PageFactory.initElements(driver, LoginPage.class);
	hp.login("prasannaachar126@gmail.com", "Prasan#1");
	Assert.assertEquals(lp.Wishlisted().getText(), wish);
	Reporter.log("product Sucessfully added to wishlist", true);
      
      

	}

}
