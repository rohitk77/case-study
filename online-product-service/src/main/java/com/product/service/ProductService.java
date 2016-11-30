package com.product.service;

import java.util.List;

import com.product.model.Product;

public interface ProductService {
	
	public void insertProduct(Product product);
	public void updateProduct(Product product);
	
	public List<Product> getAllProducts(Integer vendorId, Integer categoryId);
	
	public List<Product> getProductsByDescription(String searchText);
	
	public Product getProductById(int id);
	
	public void deleteProductById(int id);

}
