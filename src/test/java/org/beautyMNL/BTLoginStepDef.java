package org.beautyMNL;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.BTutility.BTbaseClass;
import org.BTutility.BTpojoClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import cucumber.api.java.tlh.latlh;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BTLoginStepDef extends BTbaseClass {
	


@When("User click the signin option")
public void user_click_the_signin_option() {
	BTpojoClass p=new BTpojoClass();
	p.getTextsignin().click();
  
}

@When("User should type valid and invalid username{string} and passward{string}")
public void user_should_type_valid_and_invalid_username_and_passward(String s1, String s2) {
	BTpojoClass p=new BTpojoClass();
	key(p.getTextUser(), s1);
	key(p.getTextPass(),s2);
}


@When("User should click the login button")
public void user_should_click_the_login_button() {
	BTpojoClass p=new BTpojoClass();
	p.getTextLogin().click();
}


@When("User should type the Ginger oil")
public void user_should_type_the_Ginger_oil() throws AWTException, InterruptedException {
	BTpojoClass p=new BTpojoClass();
	key(p.getTextSearchBox(), "Ginger oil");
	Thread.sleep(3000);
	p.getTextGigerOilSelect().click();
	
	
}

@When("User should select a product")
public void user_should_select_a_product() throws InterruptedException  {
	//Thread.sleep(3000);
   
}

@Then("User should click the add to cart")
public void user_should_click_the_add_to_cart() {
	BTpojoClass p=new BTpojoClass();
	FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver).withTimeout(java.time.Duration.ofSeconds(10))
			.pollingEvery(java.time.Duration.ofSeconds(1)).ignoring(Throwable.class);
	f.until(isTrue)
	p.getTextAddToCart().click();
	
	
	
}

	

}
