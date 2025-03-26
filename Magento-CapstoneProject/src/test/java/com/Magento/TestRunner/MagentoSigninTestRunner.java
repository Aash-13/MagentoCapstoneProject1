package com.Magento.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.Magento.Feature\\Signin.feature",
glue= {"com.Magento.StepDefinition"},
plugin= {"pretty","html:target/CucumberReport/Report2.html"})
public class MagentoSigninTestRunner extends AbstractTestNGCucumberTests{

}
