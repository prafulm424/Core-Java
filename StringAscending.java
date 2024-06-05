package lab;

import java.util.*;

public class StringAscending 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter the number of strings: ");
		int n = sc.nextInt();
		sc.nextLine(); 

		// Create an array to hold the strings
		String[] strings = new String[n];

		// Read the strings from the user
		System.out.println("Enter the strings: ");
		for (int i = 0; i < n; i++) 
		{
			strings[i] = sc.nextLine();
		}

		// Sort the array of strings in ascending order
		Arrays.sort(strings);

		// Print the sorted array of strings
		System.out.println("Sorted strings in ascending order: ");
		for (String str : strings) 
		{
			System.out.println(str);
		}

		sc.close(); // Close the Scanner
	}
}
