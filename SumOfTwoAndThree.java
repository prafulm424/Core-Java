package lab;
import java.util.*;
public class SumOfTwoAndThree 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int s2=0, s3= 0;
		int a[] = new int[10];
		
		System.out.println("Enter Array Elements");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("The array elements are ");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		for (int num : a) 
		{
            if (num >= 10 && num <= 99) 
            {
                s2 += num;
            }
            if (num >= 100 && num <= 999) 
            {
                s3 += num;
            }
        }
		
		System.out.println("Sum of Two Digit Numbers " + s2);
		System.out.println("Sum of Three Digit Numbers " + s3);
		
		sc.close();

	}

}
