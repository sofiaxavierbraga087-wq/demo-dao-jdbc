package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj= new Department(8, "Book");
		
		SellerDao sellerDao=DaoFactory.createSellerDao();
		
		System.out.println("==TEST 1:seller findById==");
		Seller seller= sellerDao.findById(3);
		
		System.out.println(seller);
		
		List<Seller>list=new ArrayList<>();
		
		list=sellerDao.findAll();
		for(Seller sel:list) {
			System.out.println(sel);
		}
		
	
	}
}
