package com.bangladesh.PageAction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.bangladesh.PageLocator.HomePageLocator;
import com.bangladesh.Util.TestBase_BD;
import com.bangladesh.Util.TestData;
import com.bangladesh.Util.utillll;

public class HomePageAction extends TestBase_BD  {
	
	HomePageLocator homePageLocator = new HomePageLocator();
	
	public void EnterXPSinSearchFiled() {
		homePageLocator.Searchfield.sendKeys(utillll.laptop);
		
	}
	public void ClickonSearchLink() {
		homePageLocator.SearchLink.click();
		
	}
	public void Verifysearchresultdisplay() {
		boolean searchresult =homePageLocator.VerifySearchResult.isDisplayed();
		Assert.assertTrue(searchresult);
		
	}
	
	public void ClickonSigninbutton() {
		
		homePageLocator.Signinbutton.click();
		
	}
	public void ClicksigninLink() {
		homePageLocator.Signinlink.click();
		
	}
	public void Clickonaddtocart() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;   //SCROLL DOWN
		js.executeScript("window.scrollBy(0,1200)", "");
		
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		ac.moveToElement(homePageLocator.addtocartButton1).click().build().perform();
		Thread.sleep(5000);
		//JavascriptExecutor jss = (JavascriptExecutor) driver; 
		//jss.executeScript("arguments[0].click();","homePageLocator.addtocartButton");

	}
	public void clickinaddtocartt() throws Exception {
		//JavascriptExecutor js = (JavascriptExecutor) driver;   //SCROLL DOWN
		//js.executeScript("window.scrollBy(0,1200)", "");
		
		Thread.sleep(5000);
		homePageLocator.addtocartButton2.click();
		//Actions ac = new Actions(driver);
		//ac.moveToElement(homePageLocator.addtocartButton2).click().build().perform();
		Thread.sleep(5000);
	}
	
	

}
