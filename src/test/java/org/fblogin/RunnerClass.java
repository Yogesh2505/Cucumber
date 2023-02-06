package org.fblogin;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilitys.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.fblogin",dryRun=false,tags= {"@Unita"},
            plugin= {"json:C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber\\target\\Reports\\fblogin.json"
            		,"html:C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber\\target\\Reports",
            		"junit:C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber\\target\\Reports\\fblogin.xml",
            		"rerun:src\\test\\resources\\FeatureFile\\Rerun\\Faild.txt",
            		"usage"
            })

public class RunnerClass {
	@AfterClass
	public static void reportPull() {
	JvmReport.generateJvmReport("C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber\\target\\Reports\\fblogin.json");	
		
	}

}
