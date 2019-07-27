package arraylistdemo;


import java.util.ArrayList;
import java.util.Iterator;
public class Arraylistdemo {

	
		
	public static void main(String[] args) {

		ArrayList obj = new ArrayList();
		
		obj.add(10);
		
		obj.add("Naveen");
		
		obj.add('M');
		
		obj.add("Naveen kumar");
		
		//obj.remove("Naveen");
		
		ArrayList obj2 = new ArrayList();
		
		obj2.add("Sathish");
		obj2.add("Vinee");
		
		obj.addAll(1, obj2);
		
		System.out.println(obj);
		
		/*int i = obj.size();
		//System.out.println(obj);
		//System.out.println(obj.get(2));
		
		
		//This is called enhance for loop
		//for(Object anyname : obj){
			//System.out.println(anyname);
			//Iteration can be used to run the loop 
			Iterator Itr = obj.iterator();
			//hasNext will check whether Itr is having any values in it 
			while(Itr.hasNext()) {
				//Itr,next will increase the value value of index
				Object value = Itr.next();
				System.out.println(value);				*/
				
				
			}
			
			
			
		}
		
	


