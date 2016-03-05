package org.ytheohar.bbc.geb.cucumber

import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber

@RunWith(Cucumber)
@CucumberOptions(
features=["src/test/resources/feature/bbcnews"],
glue=["src/main/groovy/org/ytheohar/bbc/geb/cucumber"],
format=["pretty", "html:build/reports/cucumber"],
monochrome=true
)
class BBCTest {
}
