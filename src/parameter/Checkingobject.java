package parameter;

public class Checkingobject {
	
	 static Checkingobject obj = new Checkingobject(); 
	
	static int a = 14;  
	static int b = 15;  
	
	public static void main(String[] args) {

		int a = 10;
		
	    int b = 12;
	    
	int sum =   obj.method2();
	
	System.out.println("the sum is "+sum);
	
	
		
	}
	
	public int  method1(int a , int b){
		
		int c = a+b;	
		
				
		return c;		
			
		}
	
	public int method2() {
		int a = 1;
		int b = 3;
		
		int sum = obj.method1(a, b);
		
		System.out.println("the result in method 2 "+sum);
		
		return sum;
		
		
	} 
	
	
		}
	
	
	


