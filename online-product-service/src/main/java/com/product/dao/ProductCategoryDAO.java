package com.product.dao;

import java.util.List;

import com.product.model.ProductCategory;

public interface ProductCategoryDAO {

	public void insertProductCategory(ProductCategory productCategory);

	public void updateProductCategory(ProductCategory productCategory);

	public List<ProductCategory> getAllProductCategoryList();

	public ProductCategory getProductCategoryById(int id);

	public void deleteProductCategoryById(int id);
}
