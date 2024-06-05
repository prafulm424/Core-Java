package lab;
import java.util.*;
public class Buzz {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num = sc.nextInt();
		if(num % 7==0 || num%10 ==7) 
		{
			System.out.println("BUZZ no");
		}
		else System.out.println("Not a BUZZ Number");
			
		sc.close();
		
		
	}

}
