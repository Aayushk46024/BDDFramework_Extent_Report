package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\AayushKhandelwal\\eclipse-workspace\\BDDFramework_Extent_Report\\src\\test\\java\\FeatureFile"
		,glue = {"StepDefination"}
		,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		,monochrome = true
		,publish = true
		
		)
public class Runner {
 
}

