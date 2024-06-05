package lab;

public class Employee extends Person
{
	 private double salary;

	    // Constructor
	    public Employee(String firstName, String lastName, double salary) 
	    {
	        super(firstName, lastName);
	        this.salary = salary;
	    }

	    // Getter method
	    public double getSalary() 
	    {
	        return salary;
	    }
}
