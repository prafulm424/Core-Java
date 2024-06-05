package lab;

import java.util.Scanner;

//5.Write a program in Java to accept a word/a String and display the new string after removing all the vowels present in it.

public class AfterRemoveVowels 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);//scanner class to take user input
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		String str1="";//Declare Empty String to hold result
		
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
	                ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') 
			{
	                str1 += ch;//append if not vowels
			}
			
		}
		System.out.println("String after removing vowels "+str1);
		sc.close();//scanner class close
		

	}

}
