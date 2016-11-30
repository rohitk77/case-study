package com.product.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.product.model.Vendor;

@Repository
public class VendorDAOImpl extends AbstractDAO implements VendorDAO {
	
	@Override
	public void insertVendor(Vendor vendor){
		entityManager.persist(vendor);
	}
	
	@Override
	public void updateVendor(Vendor vendor){
		entityManager.merge(vendor);
	}

	@Override
	public Vendor getVendorById(int id){
		return (Vendor)entityManager.find(Vendor.class, id);
	}
	
	public void deleteVendorById(int id){
		Vendor vendor = getVendorById(id);
		entityManager.remove(vendor);
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Vendor> getAllVendorList() {
		return entityManager.createQuery(" from Vendor").getResultList();
	}

}
