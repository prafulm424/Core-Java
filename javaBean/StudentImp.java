package javaBean;

public class StudentImp {

	public static void main(String[] args) 
	{
		Student std = new Student();
		std.setName("Praful");
		
		std.setRollNo(764);
		std.setCourse("BSCIT");
		std.setDiv('A');
		std.setContactNo(83695551);
		
		
		System.out.println("Name is "+std.getName());
		System.out.println("Roll No is" +std.getRollNo());
		System.out.println("Course is "+ std.getCourse());
		System.out.println("Division is "+std.getDiv());
		System.out.println("Phone no is "+std.getContactNo());
		
		

	}

}
