package com.Magento.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.Magento.Feature\\Checkout.feature",
glue= {"com.Magento.StepDefinition"},
plugin= {"pretty","html:target/CucumberReport/Report5.html"})
public class MagentoCheckoutTestRunner extends AbstractTestNGCucumberTests{

}
