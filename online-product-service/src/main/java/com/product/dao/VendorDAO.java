package com.product.dao;

import java.util.List;

import com.product.model.Vendor;

public interface VendorDAO {

	public void insertVendor(Vendor vendor);

	public void updateVendor(Vendor vendor);

	public List<Vendor> getAllVendorList();

	public Vendor getVendorById(int id);

	public void deleteVendorById(int id);
}
