package StepDepBD;

import org.apache.log4j.Logger;


import com.bangladesh.PageAction.HomePageAction;
import com.bangladesh.Util.LogsHelper_Log;
import com.bangladesh.Util.TestBase_BD;
import com.bangladesh.Util.utillll;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefHomePage extends TestBase_BD{
	
	HomePageAction homePageAction =new HomePageAction();
	//Logger loggs = LogsHelper_Log.getLogsss(LogsHelper_Log.class);
	Logger loggs = LogsHelper_Log.getLogsss(LogsHelper_Log.class);
	
	//Logger log = LogsHelper.getLogsss(LogsHelper.class);
	@Given("^Open Application \"([^\"]*)\"$")
	public void open_Application(String URL) throws Throwable {
		lunchh(URL);
		utillll.takescreenshot(driver, "Home Page");
		loggs.info("Opening URL");
		
	}

	@Then("^Enter XPS in SearchFiled$")
	public void enter_XPS_in_SearchFiled() throws Throwable {
		homePageAction.EnterXPSinSearchFiled();
		loggs.info("Entering product");
	}

	@Then("^Click on SearchLink$")
	public void click_on_SearchLink() throws Throwable {
		homePageAction.ClickonSearchLink();
		loggs.info("Clicking search link");
	}

	@Then("^Verify search result display$")
	public void verify_search_result_display() throws Throwable {
		homePageAction.Verifysearchresultdisplay(); 
		utillll.takescreenshot(driver, "Search Result Page");
		loggs.info("Result page");
	}
	@Then("^Click on addtocart$")
	public void click_on_addtocart() throws Throwable {
		homePageAction.Clickonaddtocart();
	}
	@Then("^click in addtocartt$")
	public void click_in_addtocartt() throws Throwable {
		homePageAction.clickinaddtocartt();
	}




}
