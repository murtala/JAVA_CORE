package jdbc.client;

import java.util.List;

import jdbc.daos.EmpDao;
import jdbc.vo.Emp;


public class EmpClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EmpDao eDao = new EmpDao();
		List<Emp> empList = eDao.getEmps();
		
		
		for (int i = 0 ; i< empList.size(); i++){
			Emp emp = empList.get(i);
			System.out.println(emp);
		}
		
		

	}

}
