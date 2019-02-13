//Problem: Verify if a given number is Power of 2
//@Author: Tanvir Hossain
//@Version: October 16th, 2018
//Disclaimer: I have developed this algorithm myself. It might not be the most efficient one, but it works.
import java.util.Scanner;

public class verifyPowerofTwo
{
	

	public static void main(String[] args)
	{
		
		//User input
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number: ");
		verifyPowerofTwo checkPower = new verifyPowerofTwo();
		
		while (true)
		{
			int input = reader.nextInt(); // Scans the next token of the input as an integer number
			checkPower.verifyPowerOf(input);
			
				
		}	 //end of main while loop
		
		
	} // end of main method
	
	
	
	/*
	 * Method verifyPower verifies the power of two
	 */
	
	public String verifyPowerOf (int input)
	{
		//Check all the base cases		
		//1st Base Condition
		if (input == 0 || input < 0)
		{										//Checks if input is zero or negative number
			System.out.println("ERROR: Enter a non-zero, positive number");
			return "ERROR: Enter a non-zero, positive number";
		}
	
		else if ( input == 1 )
		{										//Check if input is just 1
			System.out.println("ERROR: Input is 1, not a power of 2");
			return "ERROR: Input is 1, not a power of 2";
		}
	
		//At this point, the input has to be non-zero, positive, greater than 2
	
		else
		{
		
			if   (( input % 2) != 0 )
			{									//Checks if the input is Odd number
				System.out.println("ERROR: Please input an even number");	//If the input is Odd, the system breaks and prints out
				return "ERROR: Please input an even number";
			}
			
			//If the input number is not odd (even), then the code will reach here
			//At this point, the input has to even
		
			else
			{
				int quotient = input;
				int count = 0;
			
				//Now, this is algorithm where it is determined that an even number is power 
				//of 2 or not. The input is kept dividing by 2 until the quotient reaches 1.
				//Before that if the quotient turns to be an odd number, than the system exists and prints out
			
				/* The main algorithm */
				while (((quotient >= 2 ) && ((quotient % 2) == 0 ))) 
				{	
				
					quotient = quotient / 2;
					count = count + 1;
				} // end of this while loop
			
				//Now the if the divisions are all successfully done and if the quotient is 1, 
				//it proves that the input is a power of 2
			
				if (quotient == 1)
				{
					System.out.println("The input is a power of 2 and the power is " + count);
					return "The input is a power of 2 and the power is " + count;
				}
			
				else 
				{
					System.out.println("The input is NOT a power of 2");
					return "The input is NOT a power of 2";
				}
			}
		}
		
	} //end of verifyPowerOf method
	
	

	
} // end of the class 

