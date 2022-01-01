package model.interfaces;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller seller);
	void update(Seller seller);
	void deleteById(Integer id);
	Integer findAllId(Integer id);
	List<Seller>find();

}
