package steps;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.SwagLabs;
import utils.Constants3;


public class SwagLab {
	SwagLabs obj=new SwagLabs();
	
	SwagLabs swags;
	@Given("user navigates to swagLab page {string}")
	public void user_navigates_to_swag_lab_page(String url) throws InterruptedException {
		Constants3.driver.get(url);
		Thread.sleep(2000);	
		swags = new SwagLabs();
		Actions actions = new Actions(Constants3.driver);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		
	}

	@When("User enters username {string}")
	public void entersUsername(String userName) {
		swags.enterUserName(userName);
	}

	@When("User enters password {string}")
	public void enters_password(String password) {
		swags.enterPassword(password);
	}

	@When("User clicks on login button")
	public void loginButton() {
		swags.loginButton();
	}

@When("user clicks to add items to cart")
public void addItems() throws InterruptedException {
	obj.addToCart();
	
}

@When("user clicks to remove items from cart")
public void removeItems() throws InterruptedException {
	obj.removeFromCart();
}
}
