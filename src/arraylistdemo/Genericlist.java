package arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Genericlist {

	public static void main(String[] args) {

		//Here <> means genric array it will take only mentioned variables example string
		ArrayList<String> array_name = new ArrayList<String>();
		
		array_name.add("hdfhj");
		array_name.add("jbsbjs");
		array_name.add("kjcjc");
		array_name.add("cjncx");

		Iterator Iterator_name = array_name.iterator();
		
		while (Iterator_name.hasNext())
		{
			Object value = Iterator_name.next();
			
			System.out.println(value);
			
			
		}
	}

}
