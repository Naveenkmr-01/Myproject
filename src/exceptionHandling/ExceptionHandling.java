package exceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("Started");
		//If code in try is giving any exception, compiler will go to catch 
		try
		{
			int c = 10/0;
			
		System.out.println("Value in try "+c);
		
		}
		//If try is not giving exception, compiler will not come to catch
	
		catch(Exception abc) {
			System.out.println("Showing arithmetic exception as "+abc);
		}}}
		
		//Final always works
		