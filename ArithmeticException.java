package lab;
//Wap to show an Arithmetic exception in a program
import java.util.Scanner;

// Main class to handle ArithmeticException
public class ArithmeticException 
{
	// Main method
	public static void main(String[] args) 
	{
		// Start of try block to handle potential exceptions
		try
		{
			// Create a Scanner object to read input from the user
			Scanner sc = new Scanner(System.in);
			int numerator, denominator, result = 0;

			// Prompt the user to enter the numerator
			System.out.println("Enter Numerator");
			// Read the numerator value
			numerator = sc.nextInt();

			// Prompt the user to enter the denominator
			System.out.println("Enter Denominator");
			// Read the denominator value
			denominator = sc.nextInt();

			// Perform division and store the result
			result = numerator / denominator;

			// Print the result
			System.out.println("Result is " + result);
		}
		// Catch block to handle any exceptions that occur in the try block
		catch (Exception e)
		{
			// Print a message if an exception occurs (e.g., division by zero)
			System.out.println("Denominator cannot be zero");
		}
		// Finally block that always executes
		finally
		{
			// Print a message indicating the finally block is executing
			System.out.println("The block is executing");
		}
	}
}
