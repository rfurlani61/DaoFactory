package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		try {
			Department obj = new Department(1, "Books");
			System.out.println(obj);
			SimpleDateFormat stf = new SimpleDateFormat("dd/MM/yyyy");
			Seller obj2 = new Seller(1, "Bob", "Bob@gmail.com", new java.sql.Date(stf.parse("24/03/1963").getTime()), 4500.00, objs);
			
			SellerDao sellerdao = DaoFactory.createSellerDao();
			
			System.out.println(obj2);
		}
		catch (ParseException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
