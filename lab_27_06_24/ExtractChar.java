package lab_27_06_24;
//Write a program to extract only character from a string.  Eg: Af02284khff -> Afkhff
public class ExtractChar 
{
	public static void main(String[] args) {
		String input = "Af02284khff";
		StringBuilder result = new StringBuilder(); // Using StringBuilder for efficient string manipulation

		// Loop through each character in the input string
		for (int i = 0; i < input.length(); i++) 
		{
			char c = input.charAt(i);
			// Check if the character is a letter
			if (Character.isLetter(c)) 
			{
				result.append(c);
			}
		}

		// Convert the StringBuilder to a string
		String output = result.toString();

		// Print the original and the modified strings
		System.out.println("Original string: " + input);
		System.out.println("String with only characters: " + output);
	}
}



