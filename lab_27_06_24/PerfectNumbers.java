package lab_27_06_24;
//Display all perfect numbers between 1 to 1000.
//(perfect no : sum of the factors is the number itself eg: 6: 1+2+3=6)
public class PerfectNumbers {
	public static void main(String[] args) {
		System.out.println("Perfect numbers between 1 and 1000:");

		// Loop through each number from 1 to 1000
		for (int number = 1; number <= 1000; number++) {
			int sum = 0;

			// Find divisors and sum them up
			for (int i = 1; i <= number / 2; i++) {
				if (number % i == 0) {
					sum += i;
				}
			}

			// Check if sum of divisors equals the number
			if (sum == number) {
				System.out.println(number);
			}
		}
	}
}
