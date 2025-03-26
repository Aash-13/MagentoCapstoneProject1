package com.Magento.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.Magento.Feature\\AddToCart.feature",
glue= {"com.Magento.StepDefinition"},
plugin= {"pretty","html:target/CucumberReport/Report4.html"})
public class MagentoAddToCartTestRunner extends AbstractTestNGCucumberTests{

}
