package loopdemo;

public class Forloop {
	
	//static int i;

	public static void main(String[] args) {
		
		Forloop object = new Forloop();
		
		object.loopmethod();		
		
	}

	public void loopmethod() 
	{

		for (int i = 1;i<10;i++)
			
		{
			System.out.println(i);
		}
		
	}

}
