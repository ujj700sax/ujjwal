package Test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "/Users/qainfotech/eclipse-workspace/com.qa.test.demo/src/main/java/com/qa/test/demo/Login.feature", //the path of the feature files
		glue={"com.qa.test.StepDefination"},//path of step defination files
        format={"pretty","html:test-outout","json:json_output/cucumber.json","junit:juni/cucumber.xml"},// to give test-output report in given format
			dryRun=false,//to check mapping btw step def and feature file
			strict=true,//it will check if any step den is not defined in step def
	      monochrome =true //to make it more readable o/p , we use monochrome to display console o/o in proper readable format
 )
	public class TestRunner {

		

}