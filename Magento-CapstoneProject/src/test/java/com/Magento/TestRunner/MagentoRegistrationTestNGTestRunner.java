package com.Magento.TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.Magento.Feature\\Registration.feature",
glue= {"com.Magento.StepDefinition"},
plugin= {"pretty","html:target/CucumberReport/Report1.html"})
public class MagentoRegistrationTestNGTestRunner extends AbstractTestNGCucumberTests{

}
