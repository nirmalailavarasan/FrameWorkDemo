package Com.Runner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/features/JpetStore.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},		
		tags = {"@TC01_Register_and_Addtocart,@TC02_Searchforlink_and_Product,@TC03_Printproducttable"},
		glue = {"Com.Stepdefinition"},
		monochrome = true	
		)

public class Jpet_App_Runner {
	@AfterClass
	  public static void extendReport()
	{
		Reporter.loadXMLConfig("src/test/resources/Extent-config.xml");
		Reporter.setSystemInfo("User Name",System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone",System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine","MacOS Mojave" + "64 Bit");
		Reporter.setSystemInfo("Selenium","3.141.59");
		Reporter.setSystemInfo("Maven","4.0.0");
		Reporter.setSystemInfo("Java Version","1.8.0_131");
	}

}
