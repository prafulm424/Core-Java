package lab;

import java.util.Scanner;

//Write a program for converting a sentence in reverse.
//(Input: BASIC IS PROGRAMMING Output: PROGRAMMING IS BASIC)
public class ReverseSentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String str = sc.nextLine();
		str = " " + str + " ";
		String reverse = "";
		int end = str.length();

		// logic : 
		// I'll run loop in decreasing order
		//whenever encounter " " ,use substring method to store it in reverseString
		for (int i = str.length()-1; i >= 0; i--) {

			if ((str.charAt(i) == ' ')) {
				reverse += str.substring(i, end);
				end = i;
			}   
		}
		System.out.println(reverse);
		sc.close();
	}
}
