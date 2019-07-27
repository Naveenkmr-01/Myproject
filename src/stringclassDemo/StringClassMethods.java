package stringclassDemo;

public class StringClassMethods {

	public static void main(String[] args) {
		
		String s1 = "NaveenKumar";
		String s2 = "naveenkumar";
		
		char ch[] = s2.toCharArray();
			
//		int num = s1.compareToIgnoreCase(s2);
//		System.out.println(num);
//        System.out.println(s1.charAt(2));
//        
//        System.out.println(s1.concat(s2));
//        System.out.println(s1);
        String Copyvalue = String.copyValueOf(ch,2,1);
        
        byte  Byte[]  = s2.getBytes();
        
        for(int i=0;i<Byte.length;i++) {
        	
        	System.out.print(" "+Byte[i]);
        	
        	
        }
        System.out.println(Copyvalue);
	}

}
