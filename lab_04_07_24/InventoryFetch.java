package lab_04_07_24;
/*Create a jdbc of following Inventory and fetch 10 records in the console

inventoryNo int

name String

qty int

pricePerItem int

Stock boolean

Store the 10 inventories and fetch the data*/


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class InventoryFetch {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/inventory","root","1234");
		Statement stmt=con.createStatement(); 
		
		//Displaying the whole table 
		String s="select * from Inventory";
		ResultSet rs=stmt.executeQuery(s);
		while(rs.next())
		{
			System.out.println("Inventory Number: "+rs.getString("inventoryNo"));
			System.out.println("Name: "+rs.getString("name"));
			System.out.println("Quantity: "+rs.getString("qty"));
			System.out.println("Price per Item: "+rs.getString("pricePerItem"));
			System.out.println("In Stock: " +rs.getString("Stock"));
			System.out.println();
		}
		con.close();

	}
}

