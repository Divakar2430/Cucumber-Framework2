package org.test.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\Desktop\\Divakar\\FrameworkProject2\\src\\test\\resources\\resources\\Feature1\\Customerdetails.feature", 
glue="org.test.stepdefinition", dryRun=false, monochrome=true,
plugin= {"pretty","html:target/cucumber-reports"})

public class TestRunner6 {

}
