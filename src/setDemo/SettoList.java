package setDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Set;

public class SettoList {
	
	public static void main(String[] args) {
	
		LinkedHashSet<String> values = new LinkedHashSet<>();
	//Set<String> values = new HashSet<>();
	
	values.add("Naveen");
	
	values.add("kumar");
	
	values.add("123");
	
	values.add("456");
	
	values.add("789");
	
	System.out.println(values);
	
	//Here we are storing Set values in object "List" by mentioning this " new ArrayList<>(values);" 
	ArrayList<String> List = new ArrayList<>(values);
	
	System.out.println(List.get(2));
	
	
	}}
