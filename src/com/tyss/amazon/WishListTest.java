package com.tyss.amazon;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.amazon.genericLib.Base;
import com.amazon.genericLib.FileLib;
import com.amazon.genericLib.Utility;
import com.tyss.ObjectRepository.HomePage;
import com.tyss.ObjectRepository.LoginPage;
@Listeners(com.amazon.genericLib.ListenerImp.class)

public class WishListTest extends Base {
	public HomePage lp;
	public LoginPage hp;
	FileLib lb=new FileLib();
	Utility ut=new Utility();
	@Test
public void modifySizeTest()
{
		String url="https://www.myntra.com/";
		String title ="Online Shopping";
		String Search="Tshirt - Buy Tshirt online in India";
		String wish="WISHLISTED";
		String WishlistScreen="Wishlist";
	    boolean result=driver.getTitle().contains(title);
	   Assert.assertTrue(result);
	   lp=PageFactory.initElements(driver, HomePage.class);
	Assert.assertEquals(driver.getCurrentUrl(), url);
	Reporter.log("application is launched",true);
    Reporter.log("Home screen is displayed",true);
	lp.pname("Tshirt");
	Assert.assertEquals(driver.getTitle(), Search);
	Reporter.log("Tshirt list is displayed", true);
	ut.switchToNewWindow(driver);
	lp.Wish().click();
	System.out.println(driver.getTitle()+" page is displayed");	
	   hp=PageFactory.initElements(driver, LoginPage.class);
	hp.login("prasannaachar126@gmail.com", "Prasan#1");
	Assert.assertEquals(lp.Wishlisted().getText(), wish);
	Reporter.log("product Sucessfully added to wishlist", true);
	WebDriverWait wait=new WebDriverWait(driver, 5000);
	wait.until(ExpectedConditions.elementToBeClickable(lp.wishlist()));
	ut.moveToElement(driver, lp.wishlist());
	Assert.assertEquals(driver.getTitle(),WishlistScreen );
	Reporter.log("Wishlist Page  is displayed", true);
	lp.pduct().click();
	ut.switchToNewWindow(driver);
	System.out.println(driver.getTitle()+ "  page is displayed");
      lp.sizeM().click();
	  Reporter.log("Size is updated", true);
    lp.pinno("576223");
    lp.check().click();
}
}
