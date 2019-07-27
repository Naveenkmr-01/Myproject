package arraydemo;

public class Singlearray {

	public static void main(String[] args) {

		String student[] = new String[3];
		
		student[0] = "Naveen";
		student[1] = "kumar";
		student[2] = "Muchipalli";
		
		
       int arraysize = student.length;
       
		for (int i=0; i<arraysize; i++) {
			
			System.out.println(student[i]);
		}
		
		
	}

}
