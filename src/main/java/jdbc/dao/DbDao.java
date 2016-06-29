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
import jdbc.vo.Employee;

public class DbDao {

	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "system", "admin");
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

				Emp emp = new Emp(empNo, ename, job, mgr, hiredate, sal, com,deptNo);
				empList.add(emp);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return empList;

	}

	public boolean createEmployeeTable() {

		Connection con = null;
		Statement stmt = null;
		try {
			con = getConnection();
			stmt = con.createStatement();
			stmt.execute("create table employee ( empno number(10) , ename varchar2(100), desig varchar2(100) ) ");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
	
	
	public boolean insertIntoEmployeeTable(Employee emp) {

		Connection con = null;
		Statement stmt = null;
		try {
			con = getConnection();
			stmt = con.createStatement();
			String insertSql = "Insert into employee (empno, ename, desig) values ("  + emp.getEmpNo() + " , '" +  emp.getEname() +  "', '" + emp.getDesig() + "'  )" ;
			stmt.execute(insertSql);
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}  finally {
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} 

	}
	
	
	public boolean updateEmployee(Employee emp) {

		Connection con = null;
		Statement stmt = null;
		try {
			con = getConnection();
			stmt = con.createStatement();
			
			String updateSql = "update employee set desig = '" + emp.getDesig() +  "' where empno = 10 ";
			
			stmt.executeUpdate(updateSql);
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}  finally {
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} 

	}
	
	

}
