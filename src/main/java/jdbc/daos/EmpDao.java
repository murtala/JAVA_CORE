package jdbc.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jdbc.vo.Emp;


public class EmpDao {
	
	public Connection getConnection(){
		Connection con = null;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:8080:XE", "sys", "admin");
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}catch (SQLException e){
			e.printStackTrace();
		}
		return con;
	}
	

public List<Emp> getEmps() {
	
	List empList  = new ArrayList<Emp>();
	Statement stmt = null; 
	Connection con = null;
	ResultSet rs = null;
	con = getConnection();
	try {
		stmt = con.createStatement();
		rs = stmt.executeQuery("select * from emp");
		
		while (rs.next()) {
			long empno =rs.getLong("empno");
			long mgr = rs.getLong("mgr");
			long deptno = rs.getLong("deptno");
			long sal =rs.getLong("sal");
			
			float comm =rs.getFloat("comm");
			
			String eName =rs.getString("eName");
			String job = rs.getString("job");
			
			java.sql.Date hiredate = rs.getDate("hiredate");

			Emp emp = new Emp(empno, eName, job, mgr, hiredate,sal, comm, deptno);
			
			empList.add(emp);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
	return empList;
}}
