package Com.Stepdefinition;

import java.io.IOException;

import Com.Pages.Jpet_App_Register_and_Addtocart_Pages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Jpet_App_Register_and_Addtocart_Steps {
	Jpet_App_Register_and_Addtocart_Pages register = new Jpet_App_Register_and_Addtocart_Pages();
	@Given("^Launch application home page for register$")
	public void launchapplicationforregister() {
		register.launchapplication();
	}
	@Then("^To check for registeration$")
	public void register() throws InterruptedException, IOException  {
		register.register();
	}
		
			
	@Then("^select product category$")
	public void select_catogory() {
		register.selectcategory();
	}
	@Then("^select product$")
	public void select_product() {
		register.selectproduct();
	}
	@Then("^To check for add to cart$")
	public void addtocart() throws IOException, InterruptedException {
		 
		register.addtocart();
		register.takescreenshot1("src/test/resources/screenshot/one.png");
	}
	@And("^close browser$")
	public void close() {
		register.quit();
	}

}
