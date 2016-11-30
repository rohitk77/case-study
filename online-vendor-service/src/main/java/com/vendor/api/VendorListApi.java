package com.vendor.api;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vendor.model.Vendor;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-05T04:27:51.952Z")

@Api(value = "vendorList", description = "the vendorList API")
public interface VendorListApi {

    @ApiOperation(value = "Get List Of all available Vendors", notes = "Get List Of all available Vendors", response = Vendor.class, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of all available vendors", response = Vendor.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Vendor.class) })
    @RequestMapping(value = "/vendorList",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Vendor>> vendorListGet();

}
