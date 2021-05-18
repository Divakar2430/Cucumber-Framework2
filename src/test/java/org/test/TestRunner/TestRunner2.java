package org.test.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\Desktop\\Divakar\\FrameworkProject2\\src\\test\\resources\\resources\\Features\\Login.feature", glue="org.test.stepdefinition",dryRun=false,monochrome=true,plugin= {"pretty","json:target/cucumber-reports/Cucumber.json"})

public class TestRunner2 {

}
