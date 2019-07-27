package arraydemo;

import webDriverInterface.ChromeDriver;
public class Multiarray {

	//static data member can be used in non static methods too, but non static data member can be used only in non static method
	//Here in the array first [4] is the size of row and second [5] is the length of column
	 static String bench[][] = new String[4][5];

	public static void main(String[] args) {
		

		//String bench[][] = new String[3][4];
		Multiarray obj = new Multiarray();
		
		obj.method();
	   		 System.out.println("end here");
	    	 }	 
	public void method() {
		bench[0][0] = "first";
	     bench[0][1] = "second";
	     bench[1][0] = "third";
	     bench[1][1] = "fourth";
	     bench[2][0] = "five";
	     bench[2][1] = "six";
	     //Here length is the size of row i.e., [4]
	     int arraysize = bench.length;
	     for(int i=0; i<arraysize; i++) {
	    	 
	    	 for(int j=0; j<2; j++) {
		    	 System.out.println(arraysize);
		    	 System.out.println(bench[i][j]);  	 
    }}	Multiarray obj1 = new Multiarray();

	//String[] args = null;
	//obj1.main(args);

	     }}
