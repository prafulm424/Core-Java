package lab;
import java.util.*;// Import the Scanner class

// Program to calculate perimeter of square, rectangle, and circle using method overloading
public class Perimeter 
{
	// Method to calculate perimeter of a square
	public double perimeter(double side) 
	{
		return side * 4;
	}
	
	// Method to calculate perimeter of a rectangle
	public double perimeter(int length, int width) 
	{
		return 2 * (length + width);
	}
	
	// Method to calculate perimeter of a circle
	public double perimeter(int c, double pi, double radius) 
	{
		return c * pi * radius;
	}

	// Main method to demonstrate the perimeter calculations
	public static void main(String[] args) 
	{
		Perimeter p = new Perimeter(); // Create an object of Perimeter class
		Scanner sc = new Scanner(System.in); // Create a Scanner object for input
		
	
		System.out.println("Enter the Side of Square ");
		int square = sc.nextInt(); // Read the input side value
		// Calculate and print the perimeter of the square
		System.out.println("Perimeter of Square is " + p.perimeter(square));
		
		
		System.out.println("Enter the length of Rectangle ");
		int length = sc.nextInt(); // Read the input length value
		System.out.println("Enter the width of Rectangle ");
		int width = sc.nextInt(); // Read the input width value
		// Calculate and print the perimeter of the rectangle
		System.out.println("Perimeter of Rectangle is " + p.perimeter(length, width ));
		
		
		System.out.println("Enter the Radius of Circle ");
		double circle = sc.nextDouble(); // Read the input radius value
		// Calculate and print the perimeter of the circle
		System.out.println("Perimeter of Circle is " + p.perimeter(2, 3.14, circle));		
		sc.close(); // Close the scanner 
	}
}
