package jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jdbc.vo.Emp;

public class EmpDAo {
	
	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");/* searches for the specified class in the class path at run time and loads it in the jvm
			and register with the driver manager, then driver manager communicates with driver*/
			
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "admin");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
	public List<Emp> getAllEmployees() {
		
		List<Emp> empList = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			empList = new ArrayList<Emp>();
			
			con = getConnection();
			
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from emp");
			
			
			while (rs.next()) {
				
											
				int empNo = rs.getInt("EMPNO");
				String ename = rs.getString("ENAME");
				String job = rs.getString("JOB");
				int mgr = rs.getInt("MGR");
				Date hiredate = rs.getDate("HIREDATE");
				float sal = rs.getFloat("SAL");
				float com = rs.getFloat("COMM");
				int deptNo = rs.getInt("DEPTNO");
				
				Emp emp = new Emp(empNo, ename, job, mgr, hiredate, sal, com, deptNo);
				empList.add(emp);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return empList;
		
	}
	
	
}
