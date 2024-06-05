package lab;
import java.util.*;
public class EvenOddArray 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int even[] = new int[10];
		int odd[] = new int [10];
		int evenNum = 0, oddNum=0;
		
		System.out.println("Enter Array Elements");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The array elements are ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for (int num:arr)
		{
			if(num % 2 == 0)
			{
				even[evenNum++] = num;		
			}
			else
			{
				odd[oddNum++] = num;
			}
		}
		
		System.out.println("Even numbers");
		for(int i= 0; i<evenNum; i++)
		{
			System.out.print(even[i]+" ");
		}
		System.out.println();
		
		System.out.println("Odd numbers");
		for(int i= 0; i<oddNum; i++)
		{
			System.out.print(odd[i]+" ");
		}
		System.out.println();
		
		sc.close();
	}
}
