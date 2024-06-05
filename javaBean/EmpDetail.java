package javaBean;

import java.util.Scanner;

public class EmpDetail {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 

		EmployeeDemo emp = new EmployeeDemo();//constructor

		//setter
		System.out.println("Enter Employee Name");
		emp.setEmpName(sc.next());
		System.out.println("Enter Em2ployee Age");
		emp.setEmpAge(sc.nextInt());
		System.out.println("Enter Employee Aadhar no");
		emp.setAadhar(sc.nextInt());

		//getter 
		
		System.out.println("Employee Name is "+emp.getEmpName());
		System.out.println("Employee Age is "+emp.getEmpAge());
		System.out.println("Employee Aadhar no is "+emp.getAadhar());
	
		sc.close();

	}

}
