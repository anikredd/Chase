package com.chase.tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber_test_report" }, features = {
		"classpath:com.chase.tests.Chase.feature" }, glue = { "com.chase.stepdef" })
public class ChaseTestRunner {

}
