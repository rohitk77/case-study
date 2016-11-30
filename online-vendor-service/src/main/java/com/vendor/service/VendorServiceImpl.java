package com.vendor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vendor.dao.VendorDAO;
import com.vendor.model.Vendor;


@Service("vendorService")
@Transactional
public class VendorServiceImpl implements VendorService {
	
	@Autowired
	private VendorDAO vendorDAO;

	@Override
	public void create(Vendor vendor) {
		// TODO Auto-generated method stub
		vendorDAO.create(vendor);

	}

	@Override
	public List<Vendor> getAllVendorList() {
		// TODO Auto-generated method stub
		return vendorDAO.getAllVendorList();
	}

}
