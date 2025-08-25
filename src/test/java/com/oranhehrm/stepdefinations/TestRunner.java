package com.oranhehrm.stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\vivek\\wipro\\wiproprogramming\\src\\test\\resources\\Features",
glue= {"com.oranhehrm.stepdefinations"}
,dryRun=false
,monochrome=true)
public class TestRunner {

}
