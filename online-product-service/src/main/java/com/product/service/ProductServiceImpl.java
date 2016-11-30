package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.product.dao.ProductDAO;
import com.product.model.Product;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDAO productDAO;

	@Override
	public void insertProduct(Product product) {
		// TODO Auto-generated method stub
		productDAO.insertProduct(product);

	}
	
	@Override
	public void updateProduct(Product product){
		productDAO.updateProduct(product);
	}
	
	@Override
	public List<Product> getProductsByDescription(String searchText)
	{
		return productDAO.getProductsByDescription(searchText);
	}

	@Override
	public List<Product> getAllProducts(Integer vendorId,Integer categoryId) {
		// TODO Auto-generated method stub
		return productDAO.getAllProducts(vendorId, categoryId);
	}
	
	@Override
	public Product getProductById(int id){
		return productDAO.getProductById(id);
	}
	
	public void deleteProductById(int id){
		productDAO.deleteProductById(id);
	}

}
