package org.fblogin;

import java.io.IOException;

import org.utilitys.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	@Before(order=1)
	public void before1() {
		launchBrowser();
				
	}
	@Before(order=2)
	public void before2() {
		launchUrl("https://www.facebook.com/");
		
	}
	@Before(order=3)
	public void before3() {
		maximize();
		
	}
	@After(order=10)
	public void after1(Scenario s) throws IOException {
		String name = s.getName();
		String fileName = name.replace(" ", "_");
		toScreenShot(fileName);
		
		}
	@After(order=9)
	public void after2() {
		System.out.println("take screenshot");
		
		
	}
	@After(order=8)
	public void after3() {
		toQuit();
		
	}
	
	

}