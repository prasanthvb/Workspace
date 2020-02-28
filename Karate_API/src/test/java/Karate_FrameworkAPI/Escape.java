package Karate_FrameworkAPI;

import java.util.HashMap;

import com.intuit.karate.Json;

import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;

public class Escape {
    
    public static String readJSON(Json testData) {

        System.out.println("Customer Type is: " + testData);
        
        String str = testData.toString();
        System.out.println("Customer Type is: " + str);
        
        String req = str;
    
       /* 
        str.replace('"', '\"');
        Object req = str;*/
       /* System.out.println("TestData is: " + testData);
        System.out.println("Customer Type is: " + customerType);
        System.out.println("Customer Data is: " + testData.get(customerType));
        Object customerData = testData.get(customerType);*/
        return req;
    }

}

