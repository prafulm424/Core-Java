package lab;

import java.util.*;

public class LongestWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//create scanner class object to take input
		String str,word="",lword="";// Declare variables for the input string, current word, and longest word
		System.out.println("Enter a String");
		str=sc.nextLine();
		str= str+" ";//read the last word
		for(int i=0; i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')// Check if the character is a space
			{
				if(word.length()>lword.length())//compare two words
					lword=word;// Update the longest word if the current word is longer
				word="";//empty the word
			}
			else
				word=word+ch;// Append the character to the current word
		}
		System.out.println("Longest is: " +lword+ "Length is: " +lword.length());
		sc.close();//scanner class close

	}

}
