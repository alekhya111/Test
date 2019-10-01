package mytestrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(  
		features = "Features",
		glue = "stepdefinations",
	
	//	monochrome = true,
		format = {"pretty","html:test_output","json:json_output/cucumber.json","junit:junit_xml_output/cucumber.xml"},
				dryRun = false
		//strict = false
		)
public class TestRunner {
	
	


}
