package xml.demo2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import xml.demo2.vo.Emp;


public class DbDao {
	
	
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return con;
	}
	
	
	public static List<Emp> getEmps () {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Emp> empList = new ArrayList<Emp>();
		try {
			con = getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from emp");
			
			while (rs.next()) {
				Emp emp = new Emp();
				emp.setEmpNo(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setCom(rs.getFloat("comm"));
				emp.setHireDate(rs.getDate("HIREDATE"));
				emp.setDeptNo(rs.getInt("deptNo"));
				emp.setSal(rs.getFloat("sal"));
				emp.setJob(rs.getString("job"));
				emp.setMgr(rs.getInt("mgr"));
				
				empList.add(emp);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return empList;
		
	}
	
	public void createEmp (Emp emp) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = getConnection();
			ps = con.prepareStatement("insert into emp1 (empno, ename, job, mgr, hiredate, sal, comm, deptno) values (?,?,?,?,?,?,?,?)");
			ps.setInt(1, emp.getEmpNo());
			ps.setString(2, emp.getEname());
			ps.setString(3, emp.getJob());
			ps.setInt(4, emp.getMgr());
			ps.setDate(5, null);
			ps.setFloat(6, emp.getSal());
			ps.setFloat(7, emp.getCom());
			ps.setInt(8, emp.getDeptNo());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
