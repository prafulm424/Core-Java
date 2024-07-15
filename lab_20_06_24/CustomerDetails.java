package lab_20_06_24;

/**
Write a program to show  JDBC connection with MYSQL and perform the following operations:
Create table Customer with following fields:
Custno
Custame
Custaddress
Phoneno
City
Pincode
Country
Insert 10 rows . and display it in the console .
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class CustomerDetails 
{
	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","1234");

			System.out.println("connection establised");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from customer");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getInt(4) + "  " + rs.getString(5) + "  " + rs.getInt(6) + "  " + rs.getString(7));

			}

			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
