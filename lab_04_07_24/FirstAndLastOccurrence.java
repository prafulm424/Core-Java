package lab_04_07_24;
/*
 *  Write a program to find the index of first occurrence and last occurrence of an element in the array in a single iteration.
 *  You cannot use extra space. 
 *  The first index of occurrence and the last index of occurrence will be -1, 
 *  if the element is not present inside the array.
	Eg: 1,2,3,4,5,1,6; 10 is not present get answer as -1
 */
public class FirstAndLastOccurrence {
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4, 5, 10, 6,11,10};
        int target = 10; // Element to search for

        int firstOccurrence = -1;
        int lastOccurrence = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (firstOccurrence == -1) {
                    firstOccurrence = i;
                }
                lastOccurrence = i;
            }
        }

        if (firstOccurrence != -1) {
            System.out.println("First Occurrence = " + firstOccurrence);
            System.out.println("Last Occurrence = " + lastOccurrence);
        } else {
            System.out.println("Not Found");
        }
    }
}
