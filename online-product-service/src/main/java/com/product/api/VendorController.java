package com.product.api;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Vendor;
import com.product.service.VendorService;

@RestController
@RequestMapping("/vendor")
public class VendorController {
	
	@Autowired
	private VendorService vendorservice;
	
	private static final Logger logger = Logger.getLogger(VendorController.class);
	
	@RequestMapping(produces = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<Integer> insertVendor(@RequestBody Vendor vendor)
	{
		vendorservice.insertVendor(vendor);
		logger.info("Vendor has been created with the name : "+vendor.getName());
		return new ResponseEntity<Integer>(vendor.getId(),HttpStatus.OK);
	}
	
	@RequestMapping(produces = { "application/json" }, method = RequestMethod.PUT)
	public ResponseEntity<Integer> updateVendor(@RequestBody Vendor vendor)
	{
		vendorservice.updateVendor(vendor);
		logger.info("Vendor has been updated with the Id : "+vendor.getId());
		return new ResponseEntity<Integer>(vendor.getId(),HttpStatus.OK);
	}
	
    @RequestMapping(value="/{id}",produces = { "application/json" }, method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteVendorById(@PathVariable("id") int id)
	{
		this.vendorservice.deleteVendorById(id);
		logger.info("Vendor has been deleted with the Id : "+id);
		return new ResponseEntity<Boolean>(Boolean.TRUE,HttpStatus.OK);
	}
	
    @RequestMapping(produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<Vendor>> getAllVendorList(){
		
		return new ResponseEntity<List<Vendor>>(vendorservice.getAllVendorList(),HttpStatus.OK);
	}
	
    @RequestMapping(value="/{id}",produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<Vendor> getVendorById(@PathVariable("id") int id){
		return new ResponseEntity<Vendor>(vendorservice.getVendorById(id),HttpStatus.OK);
	}

}
