package setDemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo2 {
	
	public static void main(String[] args) {
		//This linked hash set shows data in order
	LinkedHashSet<String> values = new LinkedHashSet<>();
	
	values.add("Naveen");
	
	values.add("kumar");
	
	values.add("123");
	
	for(String e: values) {
	
		//Here values stores in "e" from for loop and prints in order as it is linked hash set
	System.out.println(e);
		
	}
	}

}