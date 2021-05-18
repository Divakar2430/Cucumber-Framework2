package org.test.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\Desktop\\Divakar\\FrameworkProject2\\src\\test\\resources\\resources\\Features\\demoguru.feature", glue="org.test.stepdefinition", dryRun=false, monochrome=true, 
 tags={"@SmokeTest","@SanityTest"})


public class TestRunner4 {

}





 
