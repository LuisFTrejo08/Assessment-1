package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.saucedemo.com/inventory.html";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(500);
		driver.manage().window().maximize();
		driver.get(url);

		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		Thread.sleep(1000);

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(1000);

		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		Thread.sleep(1000);

		WebElement shoppingCart = driver.findElement(By.className("shopping_cart_link"));
		String qty = shoppingCart.getText();
		Thread.sleep(1000);

		// span[@class='shopping_cart_badge']

		List<WebElement> addToCartButtons = driver.findElements(By.xpath("//button[text()='Add to cart']"));
		for (WebElement add : addToCartButtons) {
			add.click();
			qty = shoppingCart.getText();
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
		List<WebElement> removeFromCartButtons = driver.findElements(By.xpath("//button[text()='Remove']"));
		for (WebElement remove : removeFromCartButtons) {
			remove.click();
			Thread.sleep(1000);

			qty = shoppingCart.getText();
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

		Thread.sleep(2000);
		driver.quit();
	}

}
