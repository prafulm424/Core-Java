package lab;

import java.util.*;

public class StringPalindrome 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);//Scanner object to take user input
		System.out.println("Enter a String "); //take input a string from user
		String str=sc.nextLine();//read the input string from the user
		String str1 ="";//empty string to store reversed string
		for(int i=0; i<str.length(); i++)
		{
			char e=str.charAt(i);
			str1= e+str1;//Append the character to the beginning of 'str1' to reverse the string
        }
		}
		if(str.equals(str1))
		{
			System.out.println("Palindrome");//If they are equal, print "Palindrome"
			
		}
		else
			System.out.println("Not Palindrome");// If they are not equal, print "Not Palindrome"
		sc.close();//scanner class close
	}

}
