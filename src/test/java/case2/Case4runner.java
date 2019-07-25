package case2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/case2/case4.feature"},
                 plugin="Json:target\\JsonReport.json")
public class Case4runner {

}
