package Karate_Framework.API;

import org.junit.runner.RunWith;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit4.Karate;

@KarateOptions(features = "classpath:Karate_Framework/API/suit.feature", tags = "~@ignore") 
@RunWith(Karate.class)
public class Runner {
//
	
}
