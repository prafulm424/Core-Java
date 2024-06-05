package lab;
import java.util.Scanner;
public class StateCapital {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String[] states = new String[10];
        String[] capitals = new String[10];

        // input states and capitals
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter state " + (i + 1) + ":");
            states[i] = sc.nextLine();
            System.out.println("Enter capital of " + states[i] + ":");
            capitals[i] = sc.nextLine();
        }

        // Search for a state and display its capital
        System.out.println("Enter the state whose capital is to be searched:");
        String state = sc.nextLine();
        int index = -1;
        for (int i = 0; i < 10; i++) {
            if (states[i].equalsIgnoreCase(state)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("The capital of " + state + " is " + capitals[index] + ".");
        } else {
            System.out.println("State not found.");
        }
    }
}
