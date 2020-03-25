package Com.Stepdefinition;

import Com.Pages.Jpet_App_Printproducttable_Pages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Jpet_App_Printproducttable_Steps {
	Jpet_App_Printproducttable_Pages product=new Jpet_App_Printproducttable_Pages();
	@Given("^Launch application home page for print product table$")
	public void launchapplicationforregister() {
		product.launchapplication();
	}

	@Then("^To select category$")
	public void selectcategoryprint() {
		product.selectcategorytoprint();
	}
	@Then ("^To check for print table$")
	public void printproducttable() {	
		product.printproducttable();
	}
	@And("^close browser for print$")
	public void close() {
		product.quit();
	}

}
