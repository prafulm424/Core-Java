package lab;

import java.util.Scanner;

public class CheckIntials 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);//Scanner Class Created
		System.out.println("Enter Three Words ");
		String str = sc.nextLine();
		
		//Print the first character of the input string followed by a space
		System.out.print(str.charAt(0) + " ");
        for (int i = 1; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            if (ch == ' ') 
            {
                char ch2 = str.charAt(i + 1);//get the character after space
                System.out.print(ch2 + " ");
            }
        }
        sc.close();//scanner class close
	}

}
