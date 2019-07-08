package com.model.testexecution;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"preety","html:target/htmlreport","html:target/cucumberreport"},
features={"src\\test\\resources\\FeatureCollection"},
glue={"com.model.steps"},
tags={"@SmokeTest"})


public class TestRunner 
{

}





/*import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","html:target/htmlreport","html:target/cucumberreport"},
features={"src\\test\\resources\\FeatureCollection"},
glue={"mt.mstr.steps"},
tags={"@SmokeTest"})*/