package stringclassDemo;

import webDriverInterface.ChromeDriver;


public class CompareArray {

	public static void main(String[] args) {
		
		

		int arr1[] = {1,2,2,7,7,3,4,8,8,8,5,6};
		int arr2[] = {6,7,2,2,2,8,6,9};
		boolean status = false;
		
		
		for (int i = 0 ; i<arr1.length;i++) {
			
			for(int j=0;j<arr2.length;j++) {
				
				if(arr1[i]==arr2[j]) {					
					
					status = true;
				}
					
				}
				
			if(status)   {
				System.out.print(" "+arr1[i]);
				
				status = false;
				}
				
			}
		


			
			
			
			
			
		}
		
		
		
		
		
		
	}


