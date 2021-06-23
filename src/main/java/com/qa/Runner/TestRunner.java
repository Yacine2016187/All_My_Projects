package com.qa.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Yacine\\Desktop\\CucumberSeleniumFramework-master\\src\\main\\java\\com\\qa\\feature\\freecrm.feature", //the path of the feature files
		glue={"com/qa/StepDefinition"}, //the path of the step definition files
		plugin = {"pretty","html:test-outout","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},// to generate diff type of formats
		dryRun = false, //to check the mapping is proper between feature file and step def file
		monochrome=true,// display the console output in a proper readable format 
		strict=true
		)


public class TestRunner {

	
	
}
