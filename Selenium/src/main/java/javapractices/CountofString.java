package javapractices;

import org.testng.annotations.Test;


public class CountofString {
	
	
	@Test
	public void Approach1() {
	
		
	String src="GreatLakes@123#";
	
	int upper=0,lower=0,number=0,special=0;
	
	for (int i = 0; i < src.length(); i++) {
		char ch = src.charAt(i);
		if(ch>= 'A' && ch<= 'Z') 
			upper++;
		else if (ch>= 'a' && ch<= 'z') 
			
			lower++;
			
		 else if(ch>= '0' && ch<= '9') 
			number++;
		else
		special++;
		
	}
	System.out.println("Upperchar="+upper);	
	System.out.println("lowerchar="+lower);
	System.out.println("number="+number);
	System.out.println("Specialchar="+special);
		
	}
	
	@Test
	public void Approach2() {
		
		//using regex
		/*
		  Way1
		 uppercase --> "[^A-Z]",""
		follows
		number  "["0-9]",""or //D
		special ch -> "[A-Za-z0-9]"
		way2:
		pick each char to loop and convert tonum,
		((int)char)
		check if the Ascii value belongs to the range
		
		Way3:
		pick each chr to loop
		usigbuitin function isDigit,isupper,islower using charcter;
		
		
		
		novoresume.com
		*/
		
		 String str = "hi welcome to Tutorialspoint";
	     // String strArray[] = str.split(" ");
	      StringBuffer sb= new StringBuffer(str);
	      sb.reverse();
	      for(int i=0 ; i<str.length(); i++){
	      if(str.charAt(i)== ' '){
	         sb.insert(i, " ");
	      }
	   }
	   sb.append("");
	   System.out.println(sb);
	}

}
