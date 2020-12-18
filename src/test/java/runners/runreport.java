package runners;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		glue={"StepsDefinitions"},
		features="src/test/resources/Features/Logintest.feature",
		plugin= {"html:target/report.html"}
		)

public class runreport {


}

