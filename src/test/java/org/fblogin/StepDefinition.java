package org.fblogin;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.utilitys.BaseClass;
import org.utilitys.LoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	   
	
	@When("User should type invalid uesrname and invalid password in the text box")
	public void user_should_type_invalid_uesrname_and_invalid_password_in_the_text_box(io.cucumber.datatable.DataTable d) {
  
	  LoginPojo l=new LoginPojo();
	  List<String> li = d.asList();
	  key(l.getTextUser(),li.get(0));
	  key(l.getTextPass(),li.get(1));
	}
	

@When("User should click the login button")
public void user_should_click_the_login_button() throws InterruptedException {
	
		LoginPojo l=new LoginPojo();
		
	    l.getTextLogin().click();
	    Thread.sleep(3000);
	}
	@Then("User should negative to incorrect credential page")
	public void user_should_negative_to_incorrect_credential_page() {
		String current= driver.getCurrentUrl();
		Assert.assertTrue("verify the incorrect page", current.contains("privacy"));
		System.out.println("verify");
	   
	}
	@When("User should type valid uesrname and invalid password in the text box")
	public void user_should_type_valid_uesrname_and_invalid_password_in_the_text_box(io.cucumber.datatable.DataTable d) {
		LoginPojo l=new LoginPojo();
		List<List<String>> li = d.asLists();
		key(l.getTextUser(), li.get(1).get(2));
		key(l.getTextPass(), li.get(3).get(2));
	    
	}

	@When("User should type invalid uesrname and valid password in the text box")
	public void user_should_type_invalid_uesrname_and_valid_password_in_the_text_box(io.cucumber.datatable.DataTable d) {
		LoginPojo l=new LoginPojo();
		Map<String, String>mp = d.asMap(String.class, String.class);
		key(l.getTextUser(),mp.get("renu"));
		key(l.getTextPass(),mp.get("ram"));
	   
	}

	@When("User should type valid uesrname and not pass the password in the text box")
	public void user_should_type_valid_uesrname_and_not_pass_the_password_in_the_text_box(io.cucumber.datatable.DataTable d) {
		LoginPojo l=new LoginPojo();
		List<Map<String, String>> mp = d.asMaps();
		key(l.getTextUser(), mp.get(1).get("ram"));
		key(l.getTextPass(), mp.get(0).get("prem"));
	    
	}

@When("User should type iinavalid the username and valid password")
public void user_should_type_iinavalid_the_username_and_valid_password() {
	
		LoginPojo l=new LoginPojo();
		key(l.getTextUser(), "yoges");
		key(l.getTextPass(), "kewtguuwqeagag");




	}

}
