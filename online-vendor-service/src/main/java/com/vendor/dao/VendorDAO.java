package com.vendor.dao;

import java.util.List;

import com.vendor.model.Vendor;


public interface VendorDAO {

	void create(Vendor vendor);

	List<Vendor> getAllVendorList();
}
