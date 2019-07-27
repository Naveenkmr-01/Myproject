package setDemo;

import java.util.HashSet;
import java.util.Set;


public class HashSetDemo {
	
	public static void main(String[] args) {
		//Here you can put <> to mention the variable after HashSet
	//HashSet<String> values = new HashSet<>();
	
	//Here you can remove <>
	//HashSet<String> values = new HashSet();
	
	//Here you can create object with "Set" class as it is parent
	Set<String> values = new HashSet<>();
	
	values.add("Naveen");
	
	values.add("kumar");
	
	values.add("123");
	
	for(String e: values) {
	
		//Here values stores in "e" from for loop and prints randomly
	System.out.println(e);
		
	}
	}

}