package com.product.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.product.model.Product;

@Repository
@Transactional
public class ProductDAOImpl extends AbstractDAO implements ProductDAO {

	@Override
	public void insertProduct(Product product) {
		entityManager.persist(product);

	}
	
	@Override
	public void updateProduct(Product product){
		entityManager.merge(product);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProductsByDescription(String searchText) {

		return entityManager
				.createQuery(
						" from Product p WHERE p.description like :pattern")
				.setParameter("pattern", "%" + searchText.trim() + "%")
				.getResultList();

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProducts(Integer vendorId , Integer categoryId)
	{
		return entityManager
				.createQuery(
						"from Product p WHERE p.vendorId and p.categoryId")
				.setParameter(vendorId, categoryId)
				.getResultList();
	}
	
	@Override
	public void deleteProductById(int id){
		Product product = getProductById(id);
		entityManager.remove(product);
	}
	
	@Override
	public Product getProductById(int id){
		return (Product)entityManager.find(Product.class, id);
	}

}
