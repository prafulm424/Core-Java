package javaBean;
import java.util.*;
public class EmployeeDetail {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		
		Employee emp = new Employee();//constructor
		
		//setter
		System.out.println("Enter Employee No");
		emp.setEmpNo(sc.nextInt());
		System.out.println("Enter Employee Name");
		emp.setEmpName(sc.next());
		System.out.println("Enter Em2ployee Address");
		emp.setAddress(sc.next());
		System.out.println("Enter Employee Salary");
		emp.setSalary(sc.nextInt());
		
		//getter 
		System.out.println("Employee Number is "+emp.getEmpNo());
		System.out.println("Employee Name is "+emp.getEmpName());
		System.out.println("Employee Address is "+emp.getAddress());
		System.out.println("Employee Salary is "+emp.getSalary());
		
		sc.close();
	}

}
