package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		departmentDao.insert(new Department(null, "Cars"));
		Department dep = departmentDao.findById(2);
		dep.setName("Fashion");
		departmentDao.update(dep);
		departmentDao.deleteById(6);
		dep = departmentDao.findById(2);
		System.out.println(dep);
		 List<Department> list = departmentDao.findAll();
		 for (Department d : list) {
			 System.out.println(d);
		 }
	}
}
