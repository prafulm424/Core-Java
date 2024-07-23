package lab_04_07_24;
//Wap to sort the array of string using bubble sort
public class BubbleSortStrings {
    public static void main(String[] args) {
        String[] arr = {"Anudip", "JPMC", "JAVA", "Angular", "Course"};

        // Sorting strings using bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Strings in sorted order are:");
        for (String str : arr) 
        {
            System.out.println(str);
        }
    }
}
