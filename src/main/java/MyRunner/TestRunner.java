package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Users\\Yacine\\Desktop\\CucumberSeleniumFramework-master\\src\\main\\java\\Features\\tagging.feature", //the path of the feature files
			glue={"stepDefinitions"}, //the path of the step definition files
			plugin = {"pretty","html:test-outout","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},// to generate diff type of formats
			dryRun = false, //to check the mapping is proper between feature file and step def file
			monochrome=true,// display the console output in a proper readable format 
			strict=true, //it will check if any step is not defined in step definition file 
			tags= {"@SmokTest"}
			//ORed  : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
			//ANDed : tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
			//  ~   : tags= {"~@SmokTest"} ignore smoke test


			
			)
	 
	public class TestRunner {
	 
	}
	
	

