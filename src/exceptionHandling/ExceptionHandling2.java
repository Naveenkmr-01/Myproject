package exceptionHandling;

import java.util.InputMismatchException;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		System.out.println("Started");
		//If code in try is giving any exception, compiler will go to catch 
		try
		{
			int c = 10/0;
			
		System.out.println("Value in try "+c);
		
		}
		

			
		//If try is giving arithmetic exception, compiler will come to Arithmetic catch
	
		catch(ArithmeticException abc) {
		System.out.println("Showing arithmetic exception as "+abc);
	    }
		
		//If try is giving input mismatch exception, compiler will come to input mismatch catch
		
		catch(InputMismatchException abc) {
		System.out.println("Showing imput mismatch exception as "+abc);
		}
		
		//If compiler did not take any catch, then code will go to "exception" catch because it is parent to arithmetic and input mismatch
		//If we write "exception" catch in the starting it will throw error because it is parent and 
		//that time we must remove arithmetic and input mismatch as they are child to "Exception" 
		//Dead code example : when we write the "Exception" catch in the starting remaining catchs will not work that is called dead code 
		catch(Exception abc) {
			System.out.println("Showing parent exception class as "+abc);
		}
		
		System.out.println("Ended");

	}

}
