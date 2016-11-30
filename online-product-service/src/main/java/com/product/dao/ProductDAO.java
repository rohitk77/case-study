package com.product.dao;

import java.util.List;

import com.product.model.Product;

public interface ProductDAO {

	void insertProduct(Product product);
	
	public void updateProduct(Product product);

	List<Product> getProductsByDescription(String searchText);

	List<Product> getAllProducts(Integer vendorId, Integer categoryId);

	public Product getProductById(int id);

	public void deleteProductById(int id);
}
