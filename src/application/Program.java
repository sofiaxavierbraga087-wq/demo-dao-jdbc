package application;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj= new Department(2, "Book");
		
		SellerDao sellerDao=DaoFactory.createSellerDao();
		
		Seller seller=sellerDao.findById(3);
		
		seller=sellerDao.findById(1);
		seller.setName("Martha");
		sellerDao.update(seller);
		
	}
}
