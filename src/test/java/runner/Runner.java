package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/example/Swag.feature", 
		glue = "steps", 
		plugin = { "pretty", 
				"html:target/cucumber-reports.html", "json:target/cucumber-reports",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class Runner {

}
