package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
			
		SellerDao sellerDao = DaoFactory.createSellerDao();
			
		Seller seller = sellerDao.findById(3);
		System.out.println("====> Test 1 FindById <====");
		System.out.println(seller);
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		System.out.println();
		System.out.println("====> Test 2 FindByDepartment <====");
		for (Seller s : list) {
			System.out.println(s);
		}
	}

}
