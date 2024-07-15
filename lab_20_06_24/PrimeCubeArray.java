package lab_20_06_24;
//Write a program to input an array 10 elements and print the cube of prime numbers in it.
import java.util.*;
public class PrimeCubeArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//int num;
		int arr [] = new int[5];

		System.out.println("Enter 10 Numbers");
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		for(int i=0; i<arr.length; i++)
		{
			boolean isPrime = true;

			//check to see if the numbers are prime
			for (int j=2; j<arr[i]; j++)
			{

				if(arr[i]%j==0)
				{
					isPrime = false;
					break;
				}
			}
			//print the number
			
			System.out.println("\nCubic values of prime numbers:");
	        for (int num : arr) {
	            if (isPrime) {
	                System.out.println(num + " -> " + (num * num * num));
	            }
	        }
		}


	}

}
