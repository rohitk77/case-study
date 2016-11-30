package com.vendor.api;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.vendor.model.Vendor;
import com.vendor.service.VendorService;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-05T04:27:51.952Z")

@Controller
public class VendorListApiController implements VendorListApi {
	
	@Autowired
	private VendorService vendorService;

	public ResponseEntity<List<Vendor>> vendorListGet() {
		return new ResponseEntity<List<Vendor>>(vendorService.getAllVendorList(),
				HttpStatus.OK);
    }

}
