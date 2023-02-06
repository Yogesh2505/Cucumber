package org.fblogin;

import org.junit.Assert;
import org.utilitys.BaseClass;
import org.utilitys.LoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForgetStepDefinition extends BaseClass {
	@Given("User should launch the chrome and url")
	public void user_should_launch_the_chrome_and_url() {
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		maximize();
		
	}
	@When("User should click the forget password button")
	public void user_should_click_the_forget_password_button() {
		LoginPojo l=new LoginPojo();
		l.getTextForget().click();
	    
	}

	@When("User should type the invalid email address in text box")
	public void user_should_type_the_invalid_email_address_in_text_box() {
		LoginPojo l=new LoginPojo();
		key(l.getTextFindAccount(), "syogi2505@hgsfya");
		
	}

	@When("User should click the search button")
	public void user_should_click_the_search_button() {
		LoginPojo l=new LoginPojo();
		l.getTextSearchButton().click();
		
		
	}

	@Then("Should negative to incorrect credential page")
	public void should_negative_to_incorrect_credential_page() {
		String current= driver.getCurrentUrl();
		Assert.assertTrue("verify the incorrect page", current.contains("identify "));
		System.out.println("verify");
		
	}

}
