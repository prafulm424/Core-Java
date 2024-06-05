package lab;
import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        // Define arrays to store marks of 40 students for each subject
        int[] englishMarks = new int[40];
        int[] mathsMarks = new int[40];
        int[] scienceMarks = new int[40];
        
        // Input marks for each student
        for (int i = 0; i < 40; i++) {
            System.out.println("Enter marks for student " + (i + 1) + " in English:");
            englishMarks[i] = scanner.nextInt();
            
            System.out.println("Enter marks for student " + (i + 1) + " in Maths:");
            mathsMarks[i] = scanner.nextInt();
            
            System.out.println("Enter marks for student " + (i + 1) + " in Science:");
            scienceMarks[i] = scanner.nextInt();
        }
        
        // Calculate and print average marks secured by each student
        System.out.println("Average marks secured by each student:");
        for (int i = 0; i < 10; i++) {
            double averageMarks = (englishMarks[i] + mathsMarks[i] + scienceMarks[i]) / 3.0;
            System.out.println("Student " + (i + 1) + ": " + averageMarks);
        }
        
        // Calculate and print class average in each subject
        double englishTotal = 0, mathsTotal = 0, scienceTotal = 0;
        for (int i = 0; i < 10; i++) {
            englishTotal += englishMarks[i];
            mathsTotal += mathsMarks[i];
            scienceTotal += scienceMarks[i];
        }
        
        double englishClassAverage = englishTotal / 10;
        double mathsClassAverage = mathsTotal / 10;
        double scienceClassAverage = scienceTotal / 10;
        
        System.out.println("Class average in English: " + englishClassAverage);
        System.out.println("Class average in Maths: " + mathsClassAverage);
        System.out.println("Class average in Science: " + scienceClassAverage);
        
        scanner.close();
    }
}
