package org.example.tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = {"classpath:features/Google.feature"},
        glue = {"org.example.stepdefs"},
        plugin = {"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"})
public class TestRunner extends AbstractTestNGCucumberTests {

    @DataProvider
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
