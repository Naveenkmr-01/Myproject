package polymorphism;

public class PolymorphismDemo {
	
	static int a = 11 ; static int b = 12;

	private static final String[][] String = null;

	public static void main(String[] args) {
		
		PolymorphismDemo obj = new PolymorphismDemo();
		//int a = 14;
		//int b = 15;
				
		obj.add(a, b);
		obj.add(10, 20, 30);
		double sum = obj.add(10.23, 12);
		
		 System.out.println("sum is "+sum);
		 Typecasting obj1 = new Typecasting();
          obj1.main(args);
					
		
	}
	public void add(int a, int b) {
		
		 /*Typecasting obj1 = new Typecasting();
	java.lang.String[] args = null;
	obj1.main(args);*/
		 
				 int c = a+b;
		 System.out.println(c);
	}
	
	public void add(int a, int b,int d) {
		
		 int c = a+b+d;
		 System.out.println(c);
	}

	public double add(double a, int b) {
		
		 double c = a+b;
		 return c;
	}

}
