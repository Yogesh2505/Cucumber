package org.fblogin;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFile\\forget.feature",glue="org.fblogin",dryRun=false)
public class ForgetRunner {
	

}
