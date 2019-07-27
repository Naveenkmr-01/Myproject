package dataTypeDemo;

public class SecondClass {

	public static void main(String[] args)
	
	{
		
	
		System.out.println("Second class started");
		
		//Here we can create same object name that we created in 'Firstclass' class(another class in same package) and here I am calling method of another class to this class
		FirstClass obj1_secondclass = new FirstClass();
		
		obj1_secondclass.main(args);
		
		
		
		System.out.println("Programe ended in second class");

	}

}
