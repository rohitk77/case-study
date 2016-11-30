package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.product.dao.VendorDAO;
import com.product.model.Vendor;

@Service("vendorService")
@Transactional
public class VendorServiceImpl implements VendorService {
	
	@Autowired
	private VendorDAO vendorDAO;
	
	@Override
	public void insertVendor(Vendor vendor){
		vendorDAO.insertVendor(vendor);
	}
	
	@Override
	public void updateVendor(Vendor vendor){
		vendorDAO.updateVendor(vendor);
	}

	@Override
	public List<Vendor> getAllVendorList(){
		return vendorDAO.getAllVendorList();
	}
	
	@Override
	public Vendor getVendorById(int id){
		return vendorDAO.getVendorById(id);
	}
	
	@Override
	public void deleteVendorById(int id){
		vendorDAO.deleteVendorById(id);
	}



}
