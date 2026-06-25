package application;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		Department obj= new Department(2, "Book");
		
		SellerDao sellerDao=DaoFactory.createSellerDao();
		
		Seller seller=sellerDao.findById(3);
		
		seller=sellerDao.findById(1);
		seller.setName("Martha");
		sellerDao.update(seller);
		System.out.println("Enter Id for delete test");
		int id=scanner.nextInt();
		sellerDao.deleteById(id);
	}
}
