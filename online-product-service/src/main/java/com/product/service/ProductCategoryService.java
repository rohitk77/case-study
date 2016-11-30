package com.product.service;

import java.util.List;

import com.product.model.ProductCategory;

public interface ProductCategoryService {
	
	public void insertProductCategory(ProductCategory productCategory);

	public void updateProductCategory(ProductCategory productCategory);

	public List<ProductCategory> getAllProductCategoryList();

	public ProductCategory getProductCategoryById(int id);

	public void deleteProductCategoryById(int id);

}
