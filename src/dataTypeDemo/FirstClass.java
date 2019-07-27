package dataTypeDemo;

public class FirstClass {
	
	int a = 10;	
	static int b = 15;

	public static void main(String[] args) 
	{
		
		
		System.out.println("Second class object worked and compiler went to first class");
     
		FirstClass obj1= new FirstClass();
		
		obj1.firstmethod();
		
		System.out.println("First object done");
		
		FirstClass obj2= new FirstClass();
				
		obj2.secondmethod();
		
		System.out.println("Second object done");
		
		//second method called with class name because second methos is a static method
				FirstClass.thirdmethod();
				
				System.out.println("Static third method done");
				System.out.println("program ended");

	}
	
	public void firstmethod(){
		
		System.out.println("obj1 started");

		int x = 5,c;
		int y = 6;		
		c=a+x;
		
	//Here c value I added x and a, 'x' is the value which I gave in method and 'a' value from data members(which I gave in class not in method)
		
		System.out.println("first method = "+c);	
	}
	 public void secondmethod() 
	 {
			System.out.println("obj2 started");

		 int p = 2;		 
		 int q = 3;
		 
		 int r = q-p;
		 System.out.println("second method = "+r);
		 
	 }
	 
	 public static void thirdmethod() 
	 {
			System.out.println("static method started");

		 int m = 2;		 
		 int n = 3;
		 //Here b value taken from data members and b is a static value, So we can use static data member in static method
		 int r = m-b;
		 System.out.println("third method = "+r);

}
	 
}


