package stringclassDemo;

public class Stringclass2 {
	
	String firstname = "naaMa vachakam";
	
    String secondname = "naam hai kya";

	public static void main(String[] args) {

		String name = "muchipalli naveen kumar";
		
		boolean name2  = name.startsWith("muc");
		
		System.out.println(name2);
		
		Stringclass2 object = new Stringclass2();
		
		object.method();
	}

	public void method() {
		
		String peru = "naama vachakam";
		
	   boolean name3 = peru.equalsIgnoreCase(firstname);
		
		System.out.println(name3);
		
		Stringclass2 object2 = new Stringclass2();
		
		object2.method2();
		object2.method4();
		
	}

	
	public void method2() {
		boolean name3 = firstname.contains("naaM");
		
	    System.out.println(name3);
	    
	    Stringclass1 object3 = new Stringclass1();
	    
	    object3.method();
	   
	}
	
	public void method4() {
		
		
		String name = " n naveen  kumnar n  muchipnalli"     ;
		
		String []array = name.split("n");
		
		String another = name.trim();
		
		System.out.println(another);
		
		for(int i = 0; i < array.length; i++)
		{
			
		System.out.println(array[i]);
		}
}
}