package org.beautyMNL;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\BTFeatureFile\\BTSearchProduct.Feature",glue="org.beautyMNL",dryRun=false,
 tags="@sanity")

public class BTRunnerClass {
	
	

}
