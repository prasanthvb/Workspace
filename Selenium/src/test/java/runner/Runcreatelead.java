package runner;

import cucumber.api.CucumberOptions;
//import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/feature/Lead.feature",
		 		glue="CreateLead0",
				monochrome=true,
				tags="@sanity or @smoke"
				/*dryRun=true,
				snippets=SnippetType.CAMELCASE*/)
public class Runcreatelead extends AbstractTestNGCucumberTests{
	
	

}
