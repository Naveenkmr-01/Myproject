package stringclassDemo;

import java.util.Scanner;

public class PermutationPrint {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = scan.nextLine();
		
		char arr[] = name.toCharArray();
		
		for(int i = 0;i<arr.length;i++) {
						System.out.println(arr[i]);
			for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
			
			
			}
		}
		
		
		
		
		
	}

}
