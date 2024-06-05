package lab;
import java.util.*;
public class SecondHigestNum {
	   public static void main(String args[])
	   {
		  Scanner sc = new Scanner(System.in);
	      int temp, size;
	      int array[] = new int[10];
	      size = array.length;
	      
	      System.out.println("Enter Array Elements(Numbers)");
	      for(int i = 0; i<size; i++)
	      {
	    	  array[i]=sc.nextInt();
	      }
	      
	      for(int i = 0; i<size; i++ )
	      {
	         for(int j = i+1; j<size; j++)
	         {

	            if(array[i]>array[j])
	            {
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("Third second largest number is: "+array[size-2]);
	   sc.close();
	   }
	}
