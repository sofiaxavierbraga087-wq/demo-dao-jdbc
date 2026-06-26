package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

public class Program2 {

	public static void main(String[]args) {
		
		DaoFactory daoFactory=new DaoFactory();
		
		DepartmentDao depDao= DaoFactory.createDepartmentDao();
		
		Department department= depDao.findById(2);
		
		System.out.println(department);
		
		
		
	}
}
