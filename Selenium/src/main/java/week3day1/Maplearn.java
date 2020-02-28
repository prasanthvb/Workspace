package week3day1;

import java.util.Map;
import java.util.TreeMap;

public class Maplearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Amazon";
		char[] amaz= name.toCharArray();
		
		for (char out : amaz) {
			
			System.out.println(out);
		}
		Map <Character,Integer> myname=new TreeMap<Character,Integer>();
		
		myname.clear();
		
	}

}
