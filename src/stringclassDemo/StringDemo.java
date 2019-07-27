package stringclassDemo;

public class StringDemo {

	public static void main(String[] args) {
        String name1 = "naveen1548hghg98jh";
		
        String namearray = name1.replaceAll("[^A-Z,a-z]", "");
        
		char charname[] = namearray.toCharArray();
		
		for(int i = 0; i<charname.length;i++) {
			
			System.out.println(charname[i]);
			
		}
		
		
		
		
		
		
		

	}

}
