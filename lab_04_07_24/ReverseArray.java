package lab_04_07_24;
//Write a program in Java to Reverse an Array without using extra space.
public class ReverseArray {
	public static void main(String[] args) 
	{
		int[] array = {1, 2, 3, 4, 5}; // Replace with your array

		// Swap elements from start to end
		for (int i = 0; i < array.length / 2; i++) 
		{
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}

		// Print the reversed array
		System.out.print("Reversed array: ");
		for (int num : array) 
		{
			System.out.print(num + " ");
		}
	}
}
