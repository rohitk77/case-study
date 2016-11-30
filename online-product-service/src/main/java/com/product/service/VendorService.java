package com.product.service;

import java.util.List;

import com.product.model.Vendor;

public interface VendorService {
	
	public void insertVendor(Vendor vendor);
	
	public void updateVendor(Vendor vendor);

	public List<Vendor> getAllVendorList();
	
	public Vendor getVendorById(int id);
	
	public void deleteVendorById(int id);

}
