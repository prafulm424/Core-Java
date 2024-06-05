package lab;

import java.util.*;

public class CounVolConsDig {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);//scanner class to take user input
		String str;//declare a string variable
		int vol=0,spl=0,dig=0,word=0;
		System.out.println("Enter the String");
		str = sc.nextLine();//read string from user input
		str=" "+str;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				vol++;
			if(ch>='0'  && ch<='9')
				dig++;
			if(ch==' ')
				word++;
			// Check if the character is a special character (not a letter, digit, or whitespace)
			if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch))
				spl++;
				
		}

		System.out.println("Vowels: " + vol);
		System.out.println("Digits: " + dig);
		System.out.println("Words: " + word);
		System.out.println("Special Characters: " + spl);
		
		sc.close();//scanner class close
		
		
	}

}
