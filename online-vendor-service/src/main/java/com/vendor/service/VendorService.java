package com.vendor.service;

import java.util.List;

import com.vendor.model.Vendor;


public interface VendorService {
	
	void create(Vendor vendor);

	List<Vendor> getAllVendorList();

}
