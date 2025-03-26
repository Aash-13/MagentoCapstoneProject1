package com.Magento.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.Magento.Feature\\Logout.feature",
glue= {"com.Magento.StepDefinition"},
plugin= {"pretty","html:target/CucumberReport/Report3.html"})
public class MagentoLogoutTestRunner extends AbstractTestNGCucumberTests{

}
