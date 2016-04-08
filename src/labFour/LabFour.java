//this program is a factorial calculator
package labFour;
import java.util.Scanner;
public class LabFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Factorial Calculator!");
		String choice = "y";
		Scanner scan = new Scanner (System.in);
		while (choice.equalsIgnoreCase("y"))
		{
		System.out.println("Enter an interger that's greater than 0 but less that 10:");
		int input =scan.nextInt();
		scan.nextLine();
		long result = getFact(input);
		System.out.println("The factorial of " + input + " is " + result + ".");
		System.out.println("Continue? (y/n):");
		choice = scan.nextLine();
		}
		
		System.out.println();
		scan.close();
		
	}
	



	/**
	 * @param input
	 * @return
	 */
	public static long getFact(int input) {
		long result =1;
		
		for( int i=1; i <=input; i++)
		{
			result = result *i;
		}
		return result;
	}
	public static long getFact2 (int number)
	{
if (number == 1)
	return 1;
			return number * getFact2 (number-1);
	}

	

	
	}	


