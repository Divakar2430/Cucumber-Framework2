package org.test.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.test.objectrepository.LoginPage;
import org.test.resources.Base;
import org.test.stepdefinition.Hooks;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition1 extends Base {
	WebDriver driver = Hooks.driver;
	LoginPage page;
	@Given("Customer is on telecom page.")
	public void customer_is_on_telecom_page() throws InterruptedException {
		loadUrl("http://demo.guru99.com/");
		Thread.sleep(2000);
	}

	@When("Customer enters the user details")
	public void customer_enters_the_user_details() {
		page = new LoginPage();
		btnClick(page.getTelecomClick());
		btnClick(page.getAddCustomerClick());
		btnClick(page.getBackgroundClick());
		setText(page.getTxtFirstName(),readValuefromExcelSheet().get(1).get("Firstname"));
		setText(page.getTxtLastName(),readValuefromExcelSheet().get(1).get("Lastname"));
		setText(page.getTxtEmailAddress(),readValuefromExcelSheet().get(1).get("Email Id"));
		setText(page.getTxtAddress(),readValuefromExcelSheet().get(1).get("Address"));
	}

	@When("Customer enters the mob no and clicks the submit button")
	public void customer_enters_the_mob_no_and_clicks_the_submit_button() {
		setText(page.getTxtMobileNo(),readValuefromExcelSheet().get(1).get("Mobile no"));
		btnClick(page.getSubmitClick());
	}

	@Then("The message displayed customer id is generated successfully.")
	public void the_message_displayed_customer_id_is_generated_successfully() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(readText(page.getTxtGuruTelecom()).contains("Guru99")) {
	    System.out.println("Customer id generated successfully");
	}else {
		System.out.println("Customer id not generated");
	}
	}
}
