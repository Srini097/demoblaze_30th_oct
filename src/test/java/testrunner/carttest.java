package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src/test/resources/file.feature",
		glue="stepdefinition_addTocart",
		monochrome=true,
		plugin= {"pretty","html:target/myreport/report.html"},
		publish=true
		)

public class carttest {

}
