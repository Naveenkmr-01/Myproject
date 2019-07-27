package parameter;

public class Passparameter {
	
	static int x = 2; static int y = 3;

	public static void main(String[] args) {

		System.out.println("program started");
		
		Passparameter obj = new Passparameter();
		
		int sum = obj.method(x, y);
		
		System.out.println("sum is "+sum);
		
        
		
	}

	
	public int method(int a, int b) {
		
		int c = a+b;
		
		Passparameter2 object = new Passparameter2();
		
		
		
		
        String result = object.method2("naveen", " ", "kumar");
        		
        		System.out.println(result);
        		

		return c;
		

		
		
	}
}
