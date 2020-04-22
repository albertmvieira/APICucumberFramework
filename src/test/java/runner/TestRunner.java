package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/java/features/"},
		glue = {"stepDefinitions","hook"},
		monochrome = true, 
		tags = {},
		strict = true,
		plugin = { "pretty", "html:target/cucumber", "json:target/jsonReports/cucumber.json"})

public class TestRunner {

}