package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class executable {

	@CucumberOptions(features="src/main/java/features/CreateOpportunity.feature",glue="stepdef")
	public class Executable extends AbstractTestNGCucumberTests {



	}
}
