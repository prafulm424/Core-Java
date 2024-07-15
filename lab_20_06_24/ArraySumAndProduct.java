package lab_20_06_24;
// Create a double dimensional array 3X3 and find the sum and product.
import java.util.*;

public class ArraySumAndProduct {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] array = new int[3][3];
		int sum = 0;
		long product = 1;

		// Input elements for the 3x3 array
		System.out.println("Enter 9 elements for a 3x3 array:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				array[i][j] = scanner.nextInt();
				sum += array[i][j];
				product *= array[i][j];
			}
		}

		// Print the array elements
		System.out.println("The 3x3 array is:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		// Print the sum and product of the elements
		System.out.println("Sum of all elements: " + sum);
		System.out.println("Product of all elements: " + product);

		scanner.close();
	}
}