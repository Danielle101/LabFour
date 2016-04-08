package testRecursion;

import java.util.Scanner;

public class testRe {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int input =scan.nextInt();
		
		long result =1;
		
		for( int i=1; i <=input; i++)
		{
			result = result *i;
		}
		System.out.println(result);
		}

	
}

