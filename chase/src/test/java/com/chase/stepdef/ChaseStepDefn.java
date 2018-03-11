package com.chase.stepdef;

import org.junit.Assert;

import com.chase.utils.CommonHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChaseStepDefn {

	@Given("^A Chase Mobile App$")
	public void a_Chase_Mobile_App() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("");
	}

	@When("^I launch the app on \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_launch_the_app_on_and_and(String platform, String platformVersion, String deviceId) throws Throwable {
		CommonHelper.setupAppiumDriver(platform, platformVersion, deviceId);

	}

	@Then("^I should view the Logon Screen$")
	public void i_should_view_the_Logon_Screen() throws Throwable {

		Assert.assertTrue("LogonScreen Not Found!!", CommonHelper.verifyEnrolButton());
	}

	@When("^I Tap on Enroll Button$")
	public void tap_on_Enroll_Button() throws Throwable {
		CommonHelper.tapEnrolButton();
	}

	@Then("^I should view the Basic Info Screen$")
	public void i_should_view_the_Basic_Info_Screen() throws Throwable {

		Assert.assertTrue("Basic Info Screen Not Found!!", CommonHelper.clickUserID());
	}
}
