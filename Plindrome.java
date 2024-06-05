package lab;
import java.util.*;
public class Plindrome 
{
    public static void main(String args[]) 
    {
    	Scanner sc = new Scanner(System.in);
        int r, sum = 0, temp;
        System.out.println("Enter a Number");
        int n = sc.nextInt(); // It is the number variable to be checked for palindrome
        temp = n;
        while (n > 0) 
        {
            r = n % 10; // Getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome");
        sc.close();
    }
}
