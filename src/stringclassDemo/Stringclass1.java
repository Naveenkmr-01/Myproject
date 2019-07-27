package stringclassDemo;

public class Stringclass1 {
	
	static String name = "naveen";

	public static void main(String[] args) {

		//String name = "Naveen kumar Scientist";
		
		//System.out.println(name);
		
		boolean name1 = name.equalsIgnoreCase("naveen");
		
		System.out.println(name1);
		
		Stringclass1 object = new Stringclass1();
		
		object.method();
		
		}
	
	public void method() {
		
		boolean name2 = name.equalsIgnoreCase("naveen kumar scientist");
		
		System.out.println(name2);
		
		System.out.println("came here");
	}

}
