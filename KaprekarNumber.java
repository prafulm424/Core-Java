package lab;
import java.util.*;
public class KaprekarNumber
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int p = 0;
        int digit=0,square,sum=0;
        square = num*num;
        p=square;
        while(square>0)
        {
            digit++;
            square=square/10;
        }
        int k=(int)Math.pow(10,(digit/2));
        while(p>0)
        {
            sum=sum+(p%k);
            p=p/k;
        }
        if(sum==num){
        System.out.println(num+" Is a kaprekar number");
        }
        else{
        System.out.println(num+" Is not a kaprekar number");
        sc.close();
        }
    }
}