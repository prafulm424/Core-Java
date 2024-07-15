package lab_27_06_24;
// Create a JDBC connection for above Employee table and fetch the record in the console
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class EmployeeFetchDetails {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/company","root","1234");
		Statement stmt=con.createStatement(); 
		
		//Displaying the whole table 
		String s="select * from Employee";
		ResultSet rs=stmt.executeQuery(s);
		while(rs.next())
		{
			System.out.println("Employee ID: "+rs.getString("Employee_Id"));
			System.out.println("Name: "+rs.getString("Employee_Name"));
			System.out.println("Address: "+rs.getString("Employee_Address"));
			System.out.println("Salary: "+rs.getString("Employee_Salary"));
			System.out.println("Contact No: " +rs.getString("Employee_Contact_No"));
			System.out.println("Department ID: "+rs.getString("Department_ID"));
			System.out.println();
		}
		con.close();

	}
}
