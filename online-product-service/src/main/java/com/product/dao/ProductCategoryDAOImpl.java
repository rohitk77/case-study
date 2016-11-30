package com.product.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.product.model.ProductCategory;

@Repository
@Transactional
public class ProductCategoryDAOImpl extends AbstractDAO implements ProductCategoryDAO {

	@Override
	public void insertProductCategory(ProductCategory productCategory) {
		entityManager.persist(productCategory);
	}

	public void updateProductCategory(ProductCategory productCategory) {
		entityManager.merge(productCategory);
	}

	public ProductCategory getProductCategoryById(int id) {
		return (ProductCategory) entityManager.find(ProductCategory.class, id);
	}

	public void deleteProductCategoryById(int id) {
		ProductCategory productCategory = getProductCategoryById(id);
		entityManager.remove(productCategory);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProductCategory> getAllProductCategoryList() {
		return entityManager.createQuery(" from ProductCategory").getResultList();
	}

}
