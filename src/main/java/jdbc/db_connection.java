package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class db_connection 
{

	
	public static void main(String[] args) throws Exception
	{
		///load the driver class into memory  ... this will register the class
		//Class.forName("jdbc.oracle.driver.oracledriver"); /// for oracle loading the driver class
		//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // for sql server
	    //Class.forName("com.mysql.jdbc.Driver")  //for mysql

		
		//get the database connection and store in connection object
		Connection cn=DriverManager.getConnection("    ");
		
		//Connection cn=DriverManager.getConnection("jdbc:mysql://mysqlsystemname:portno/dbName", "username", "password");  /// mysql getconnection
		//Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@oraclesysname:portno:sid", "usernmae","password"); //for oracle  --SID, portno,,we can get details from Developers
		//Connection cn=DriverManager.getConnection("jdbc:sqlserver://sqlserversysname\\sqlexpress;user=username;password=passwd"); //for sql server connection
		
		//create statement object
		Statement st=cn.createStatement();

		///execute any sql query which will get the records from DB and store in ResultSet
		ResultSet rs=st.executeQuery(" sql query to select records from table");
		//ResultSet rs=st.executeQuery("select ename,sal,desig from employee");
		
		while(rs.next())
		{
			///read record from resultSet
			System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"   "+rs.getString(3));
			
		}
		
	}

}
