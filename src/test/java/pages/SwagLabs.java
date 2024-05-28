package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Constants3;

public class SwagLabs {
	@FindBy(id = "user-name")
	WebElement usernameField;

	@FindBy(id = "password")
	WebElement passwordField;

	@FindBy(id = "login-button")
	WebElement loginButton;

	@FindBy(className = "shopping_cart_link")
	WebElement shoppingCart;

	@FindBy(xpath = "//button[text()='Add to cart']")
	List<WebElement> addToCartButtons;

	@FindBy(xpath = "//button[text()='Remove']")
	List<WebElement> removeFromCartButtons;

	public SwagLabs() {
		PageFactory.initElements(Constants3.driver, this);
	}

	//// button[contains(text(),'Add to cart')]

	public void enterUserName(String userName) {
		usernameField.sendKeys(userName);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void loginButton() {
		loginButton.click();
	}

	public void addToCart() throws InterruptedException {
		for (WebElement add : addToCartButtons) {
			add.click();
			String qty = shoppingCart.getText();
			String currentQty = shoppingCart.getText();
			Thread.sleep(1000);
			if (qty.equals(currentQty)) {
				System.out.println(currentQty);
				continue;
			} else {
				System.out.println("shoping card dont work");
				break;
			}
		}
	}

	public void removeFromCart() throws InterruptedException {
		for (WebElement remove : removeFromCartButtons) {
			remove.click();
			Thread.sleep(1000);
			String qty = shoppingCart.getText();
			String currentQty = shoppingCart.getText();
			Thread.sleep(1000);
			if (qty.equals(currentQty)) {
				System.out.println(currentQty);
				continue;
			} else {
				System.out.println("shoping card dont work");
				break;
			}
		}
	}

}
