package org.test.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\user\\Downloads\\eclipse\\Divakar\\CucumberFramework\\src\\test\\resources\\Cucumber2.feature", 
glue="org.test.steps", dryRun=false, monochrome=true,
plugin= {"pretty","html:target/cucumber-reports"})

public class TestRunner5 {

}
