package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.product.dao.ProductCategoryDAO;
import com.product.model.ProductCategory;

@Service("productCategoryService")
@Transactional
public class ProductCategoryServiceImpl implements ProductCategoryService {

	@Autowired
	private ProductCategoryDAO productCategoryDAO;

	@Override
	public void insertProductCategory(ProductCategory productCategory) {
		productCategoryDAO.insertProductCategory(productCategory);
	}

	@Override
	public void updateProductCategory(ProductCategory productCategory) {
		productCategoryDAO.updateProductCategory(productCategory);
	}

	@Override
	public List<ProductCategory> getAllProductCategoryList() {
		return productCategoryDAO.getAllProductCategoryList();
	}

	@Override
	public ProductCategory getProductCategoryById(int id) {
		return productCategoryDAO.getProductCategoryById(id);
	}

	@Override
	public void deleteProductCategoryById(int id) {
		productCategoryDAO.deleteProductCategoryById(id);
	}

}
