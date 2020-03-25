package Com.Stepdefinition;

import java.io.IOException;

import org.junit.Assert;

import Com.Pages.Jpet_App_Searchforlink_and_Searchforproduct_Pages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Jpet_App_Searchforlink_and_Searchforproduct_Steps {
	Jpet_App_Searchforlink_and_Searchforproduct_Pages search=new Jpet_App_Searchforlink_and_Searchforproduct_Pages();
	@Given("^Launch application home page search options$")
	public void launchapplicationforregister() {
		search.launchapplication();
	}
	@Then("^To check for link$")
	public void checkforlink() {
		int b =search.Checkforlink();
		if(b>0)
		{
			System.out.println("The link is present");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("The link is not present");
			Assert.assertFalse(false);
		}
	}
	
	@Then("^to enter a product name$")
	public void typeaproduct() {
		search.type_a_product();
	}
	@Then("^To check for search$")
	public void search() throws IOException, InterruptedException {
		
		search.search();
		search.takescreenshot6("src/test/resources/screenshot/search.png");
	}
	@And("^close browser for search$")
	public void close() {
		search.quit();
	}

}
