package com.vendor.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.vendor.model.Vendor;
import com.vendor.service.VendorService;

import io.swagger.annotations.ApiParam;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-05T04:27:51.952Z")
@Controller
public class CreateVendorApiController implements CreateVendorApi {
	
	@Autowired
	private VendorService vendorService;

    public ResponseEntity<Integer> createVendorPut(@ApiParam(value = "Create Vendor with Name", required = true) @RequestParam(value = "vendorName", required = true) String vendorName



) {
        Vendor vendor = new Vendor();
        vendor.setName(vendorName);
        
        vendorService.create(vendor);
        
        return new ResponseEntity<Integer>(vendor.getId(),HttpStatus.OK);
    }

}
