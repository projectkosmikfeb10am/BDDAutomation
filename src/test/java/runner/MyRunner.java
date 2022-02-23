/**
 * 
 */
package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resources\\features",
		glue="steps",
		monochrome=true,
		plugin= {"html:target\\cucumber-reports.html"},
		
		tags="@wip0217",
		dryRun=false
		
		)
public class MyRunner {

}
