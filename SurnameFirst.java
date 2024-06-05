package lab;

import java.util.*;

public class SurnameFirst 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);//Scanner class object Created
		System.out.println("Enter a Name ");
		String name = sc.nextLine();//Take a name input from user

		int lastSpaceIdx = name.lastIndexOf(' '); //Find the index of the last space in the name

		String surname = name.substring(lastSpaceIdx + 1);// Extract the surname from the input name
		String initialName = name.substring(0, lastSpaceIdx);// Extract the initial part of the name (excluding the surname)

		System.out.println(surname + " " + initialName);// Print the surname followed by the initial part of the name
		sc.close();//Scanner class close

	}
	

}
