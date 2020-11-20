package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		 features = "src/test/resources/features"
		 ,glue={"steps"}
		 ,tags = {"~@regressionTest"}
		 ,plugin = { "pretty" ,"html:target/CucumberReports"}
		 ,monochrome = true
		 ,dryRun = false 
		
		 )
public class RunnerClass {

}
