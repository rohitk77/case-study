package com.product.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.ProductCategory;
import com.product.service.ProductCategoryService;

@RestController
@RequestMapping("/productcategory")
public class ProductCategoryController {
	
	@Autowired
	private ProductCategoryService productCategoryService;
	
	@RequestMapping(produces = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<Integer> insertProductCategory(@RequestBody ProductCategory productCategory)
	{
		productCategoryService.insertProductCategory(productCategory);
		return new ResponseEntity<Integer>(productCategory.getCategoryId(),HttpStatus.OK);
	}
	
	@RequestMapping(produces = { "application/json" }, method = RequestMethod.PUT)
	public ResponseEntity<Integer> updateProductCategory(@RequestBody ProductCategory productCategory)
	{
		productCategoryService.updateProductCategory(productCategory);
		return new ResponseEntity<Integer>(productCategory.getCategoryId(),HttpStatus.OK);
	}
	
    @RequestMapping(value="/{id}",produces = { "application/json" }, method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteProductCategoryById(@PathVariable("id") int id)
	{
		this.productCategoryService.deleteProductCategoryById(id);
		return new ResponseEntity<Boolean>(Boolean.TRUE,HttpStatus.OK);
	}
	
    @RequestMapping(produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<ProductCategory>> getAllProductCategoryList(){
		
		return new ResponseEntity<List<ProductCategory>>(productCategoryService.getAllProductCategoryList(),HttpStatus.OK);
	}
	
    @RequestMapping(value="/{id}",produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<ProductCategory> getProductCategoryById(@PathVariable("id") int id){
		return new ResponseEntity<ProductCategory>(productCategoryService.getProductCategoryById(id),HttpStatus.OK);
	}

}
