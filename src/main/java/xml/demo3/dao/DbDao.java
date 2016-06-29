package xml.demo3.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import xml.demo3.vo.Emp;
import xml.demo3.vo.Student;


public class DbDao {

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public static List<Emp> getEmps() {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Emp> empList = new ArrayList<Emp>();
		try {
			con = getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from emp order by empno");

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

				System.out.println(rs.getDate("HIREDATE"));

				empList.add(emp);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return empList;

	}

	public static void insertStuds(List<Student> studsList) {
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			for (int i = 0; i < studsList.size(); i++) {
				Student stud = studsList.get(i);
				String insertSql = "insert into student (sid, sname, email, mobile) values ("
						+ stud.getSid()
						+ ", '"
						+ stud.getSname()
						+ "', '"
						+ stud.getEmail() + "' , '" + stud.getMobile() + "')";
				
				System.out.println(insertSql);
				
				stmt.execute(insertSql);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
