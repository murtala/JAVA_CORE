package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class db_connect 
{

	public static void main(String[] args) throws Exception
	{
		//load the driver mangage
		Class.forName("com.mysql.jdbc.Driver");
		//get connection to the db
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/employee", "root", "");
		//create statement obj
		Statement st=cn.createStatement();
		//execute sql query  (update, delete, insert...etc)
		st.execute("update emp set sal=sal-2000 where empid=10");
		
		//executequery---to select records from table,,, it will return the records into ResultSet object.
		ResultSet rs=st.executeQuery("select ename,sal from emp");
		while(rs.next())
			System.out.println(rs.getString(1)+"       "+rs.getInt(2));
		
		cn.close();

	}

}
