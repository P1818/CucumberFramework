package ASHFormBuilder.Steps;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by anoop.singh on 2/6/2017.
 */

@CucumberOptions(format={"pretty", "html:target/cucumber"},
        features = "D:\\ASH_Automation\\ASH Automation\\src\\test\\java\\ASHFormBuilder\\Features\\TestFeature.feature")
        //glue = "Steps")
        //tags = "@runtest"

public class MyRunner extends AbstractTestNGCucumberTests{

}
