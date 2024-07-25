package application;

import java.util.Date;
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
		List<Seller> listAll = sellerDao.findAll();
		System.out.println();
		System.out.println("====> Test 3 FindAll <====");
		for (Seller s : listAll) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println("====> Test 4 Seller insert <====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id: " + newSeller.getId());
		
		System.out.println();
		System.out.println("====> Test 5 Seller update <====");
		seller = sellerDao.findById(1);
		seller.setName("Brenda Lee");
		sellerDao.update(seller);
		System.out.println("Update completed!");
	}

}
