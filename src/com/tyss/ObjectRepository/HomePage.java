package com.tyss.ObjectRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class HomePage 
{
	
	@FindBy(xpath="//input[@class='desktop-searchBar']")
	private WebElement search;
     
	@FindBy(xpath="//h4[contains(text(),'Round Neck Navy Blue T-shirt')]")
	private WebElement pduct;
    
	@FindBy(xpath="//span[text()='WISHLIST']")
	private WebElement Wishlist;
	
	@FindBy(xpath="//span[text()='Wishlist']")
	private WebElement Wishlst;
	
	@FindBy(xpath="//span[text()='WISHLISTED']")
	private WebElement wishlisted;
	
	@FindBy(xpath="//span[text()='Profile']")
	private WebElement profile;
	
	@FindBy(xpath="//div[text()=' Logout ']")
	private WebElement Logout;
	
	@FindBy(xpath="//img[@class='itemcard-itemImage']")
	private WebElement product;
	
	@FindBy(xpath="//p[text()='M']")
	private WebElement Size;
	
	@FindBy(xpath="//input[@class='pincode-code']")
	private WebElement pincode;
	
	@FindBy(xpath="//input[@value='Check']")
	private WebElement Check;
	
	@FindBy(xpath="//a[text()='Kids']")
	private WebElement Kids;
	
	@FindBy(xpath="//a[text()='Kids']/..//a[text()='Sports Shoes']")
	private WebElement Shoes;
	
	@FindBy(xpath="//h4[contains(text(),'Unisex Terrex A')]")
	private WebElement Product;
	
	@FindBy(xpath="//button[text()='Size Chart']")
	private WebElement size;
	
	@FindBy(xpath="//label[@id='US']")
	private WebElement check;
	
	@FindBy(xpath="//div[contains(@class,'size-chart-cta')]//span[text()='WISHLIST']")
	private WebElement Wish;
	
	@FindBy(xpath="//a[text()='Home & Living']")
	private WebElement HomeL;
	
	@FindBy(xpath="//a[text()='Clocks']")
	private WebElement Clck;
	
	@FindBy(xpath="//h3[text()='ZANIBO']/following-sibling::h4[contains(text(),'28 cm Analogue Wall Clock')]")
	private WebElement ClkTyp;
	
	@FindBy(xpath="//div[contains(@class,'logoContainer')]")
	private WebElement logo;
	
	@FindBy(xpath="//a[text()='LOGIN']")
	private WebElement login;
	
	@FindBy(xpath="//a[text()='CONTINUE SHOPPING']")
    private WebElement Cshoping;
	
	@FindBy(xpath="//a[text()='Men']")
	private WebElement men;
	
	@FindBy(xpath="//a[text()='Jackets']")
	private WebElement jack;
	
	@FindBy(xpath="//h3[text()='WROGN ACTIVE']")
    private WebElement itm;
	
	public WebElement items()
	{
		return itm;
	}
	
	public WebElement jacket()
	{
		return jack;
	}
	
	public WebElement menShop()
	{
		return men;
	}
	
	public WebElement continueshop()
	{
		return Cshoping;
	}
	public WebElement lgin()
	{
		return login;
	}
	
	public WebElement logo()
	{
		return logo;
	}
	
	public WebElement clockType()
	{
		return ClkTyp;
	}
	
	public WebElement clock()
	{
		return Clck;
	}
	
	public WebElement homeLiving()
	{
		return HomeL;
	}
	
	
	public WebElement list()
	{
		return Wish;
	}
	
	public WebElement cBox()
	{
		return check;
	}
	
	public WebElement Length()
	{
		return size;
	}
	
	public WebElement prduct()
	{
		return Product;
	}
	
	public WebElement shoes()
	{
		return Shoes;
	}
	
	public WebElement kids()
	{
		return Kids;
	}
	
	public WebElement check()
	{
	return Check;
	}
	
	public WebElement pincode()
	{
		return pincode;
	}
	
	public WebElement sizeM()
	{
		return Size;
	}
	
	public WebElement Sign()
	{
		return search;
	}
	public WebElement getMoreLink() 
	{
		return pduct;
	}
	public WebElement Wish()
	{
		return Wishlist;
		
	}
	
	public WebElement wishlist()
	{
		return Wishlst;
	}
	public WebElement Wishlisted()
	{
		return wishlisted;
	}
	
	public WebElement profile()
	
	{
		return profile;
	}
	
	public WebElement logout()
	{
		return Logout;
	}
	public WebElement pduct()
	{
		return product;
	}
	
   public void pname(String product)
   {
	   search.sendKeys(product,Keys.ENTER);
	   pduct.click();
   }
   public void pinno(String pinno)
   {
	   pincode.sendKeys(pinno);
   }
   
  
	
	
}
