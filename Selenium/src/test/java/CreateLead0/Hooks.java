package CreateLead0;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void beforesc(Scenario Sc) {
		System.out.println(Sc.getName());
		System.out.println(Sc.getId());
	}
	
	@After
	public void aftersc(Scenario Sc) {
		System.out.println(Sc.getStatus());
		
	}
}
