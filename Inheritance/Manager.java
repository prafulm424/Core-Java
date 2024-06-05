package Inheritance;

public class Manager extends Employee
{
	private String post;

    // Constructor
    public Manager(String firstName, String lastName, double salary, String post) {
        super(firstName, lastName, salary);
        this.post = post;
    }

    // Getter method
    public String getPost() {
        return post;
    }
}
