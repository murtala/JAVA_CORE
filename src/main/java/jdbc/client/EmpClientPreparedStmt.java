package jdbc.client;

import java.util.List;

import jdbc.dao.DbDaoPreparedStmt;
import jdbc.vo.Emp;

public class EmpClientPreparedStmt {
	
	public static void main(String[] args) {
		
		
		DbDaoPreparedStmt dbdao = new DbDaoPreparedStmt();
		
		List<Emp> list = dbdao.getAllEmployees();
		
		
		for (int i = 0 ; i < list.size(); i++) {
			Emp emp = list.get(i);
			System.out.println(emp);
		}
		
	}

}
