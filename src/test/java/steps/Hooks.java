package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Constants3;

public class Hooks {
	@Before
	public void setUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Constants3.driver = new ChromeDriver();
		Constants3.driver.manage().window().maximize();
		Constants3.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
	
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		Constants3.driver.quit();
	}
}
