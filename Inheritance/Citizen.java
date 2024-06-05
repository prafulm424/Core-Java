package Inheritance;

public class Citizen extends Person 
{
	private String citizenship;

    // Constructor
    public Citizen(String firstName, String lastName, String citizenship) {
        super(firstName, lastName);
        this.citizenship = citizenship;
    }

    // Getter method
    public String getCitizenship() {
        return citizenship;
    }
        public static void main(String[] args) {
            // Single Inheritance
            Employee employee = new Employee("Praful", "More", 50000);
            System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName() +
                    ", Salary: $" + employee.getSalary());

            // Multilevel Inheritance
            Manager manager = new Manager("Omkar", "Suryavanshi", 80000, "Senior Manager");
            System.out.println("Manager: " + manager.getFirstName() + " " + manager.getLastName() +
                    ", Salary: $" + manager.getSalary() + ", Post: " + manager.getPost());

            // Hierarchical Inheritance
            Citizen citizen = new Citizen("Pratik", "Bidaye", "India");
            System.out.println("Citizen: " + citizen.getFirstName() + " " + citizen.getLastName() +
                    ", Citizenship: " + citizen.getCitizenship());
        }
    
}
