package com.amazon.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.tyss.ObjectRepository.HomePage;

public class Base {
	public FileLib flib = new FileLib();
	public WebDriver driver;
	public static WebDriver scrnDriver;
	public WebDriverWait wait;
	public HomePage hp;
      Utility ut;
	@BeforeClass
	public void configBC() {
		if (flib.getPropertyKeyValue("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/com/Amzon/resources/chromedriver.exe");
			driver = new ChromeDriver();
			scrnDriver = driver;
		} else if (flib.getPropertyKeyValue("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/com/Amzon/resources/geckodriver.exe");
			driver = new FirefoxDriver();
			scrnDriver = driver;
		} else {
			System.setProperty("webdriver.chrome.driver", "./src/com/Amzon/resources/chromedriver.exe");
			driver = new ChromeDriver();
			scrnDriver = driver;

		}

		driver.manage().window().maximize();
		driver.get(flib.getPropertyKeyValue("url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 20);
	}

	@BeforeMethod
	public void configBM() {
    hp = PageFactory.initElements(driver, HomePage.class);
	}

	@AfterMethod
	public void configAM() 
	{
	    hp = PageFactory.initElements(driver, HomePage.class);
	    ut=new Utility();
	    ut.moveToElement(driver, hp.profile());
	     hp.logout().click();
	}

	@AfterClass
	public void configAC() throws Exception
	{
		driver.quit();
		System.out.println("sucessfully logout");
	}
	

}
