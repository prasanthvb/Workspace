package Karate_FrameworkAPI;



import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import com.intuit.karate.junit4.Karate;

@RunWith(Karate.class)
@KarateOptions(features = "classpath:Karate_FrameworkAPI/suit.feature") 


public class RunnerClass {
	 
	@BeforeClass
	    public static void before() {
	        System.setProperty("karate.env", "stage");
	    }
	
	
	@Test
    public void testParallel() {
        Results results = Runner.path("classpath:target").tags("~@ignore").parallel(5);
        assertTrue(results.getErrorMessages(), results.getFailCount() == 0);
    }
}
