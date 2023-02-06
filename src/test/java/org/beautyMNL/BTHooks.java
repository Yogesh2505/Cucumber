package org.beautyMNL;

import org.BTutility.BTbaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BTHooks extends BTbaseClass {
	@Before
	public void beforeRun() {
		launchBrowser();
		launchUrl("https://beautymnl.com/home");
		maximize();
		
		

	}
	
	@After
	public void afterRun() {
		System.out.println("executed");
		

	}
	

}
