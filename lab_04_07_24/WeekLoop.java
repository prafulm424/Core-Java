package lab_04_07_24;
/*
 * Write a program to show user of nested for loop.
             Output should be: -
     Week1
                  Monday
                  Tuesday
                  ..
                  ..
                  ..
                  Saturday
Week2
      Monday
      Tuesday
      ..
      ..
      ..
      Saturday
Week3
      Monday
      Tuesday
      ..
      ..
      ..
      Saturday
 */
public class WeekLoop {
	public static void main(String[] args) {
		int numWeeks = 3; // number of weeks
		String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

		for (int week = 1; week <= numWeeks; week++) 
		{
			System.out.println("Week" + week);
			for (String day : daysOfWeek) 
			{
				System.out.print(day + " ");
			}
			System.out.println(); // Move to the next line after printing days of the week
		}
	}
}
