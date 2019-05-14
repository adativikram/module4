package com.src.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\vikram sagar\\eclipse-workspace\\moduleTest4\\src\\main\\java\\com\\src\\feature\\login.feature", glue = {
		"stepDefinition" })
public class ConferenceRunner {

}
