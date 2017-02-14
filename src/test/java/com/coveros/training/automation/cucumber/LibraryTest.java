package com.coveros.training.automation.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags={"@datatable"}, plugin = { "html:target/cucumber-html-report" }, features = { "src/test/resources/cucumber/features" })
public final class LibraryTest {

}
