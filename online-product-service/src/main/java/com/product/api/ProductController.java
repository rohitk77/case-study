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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Product;
import com.product.service.ProductService;

import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productservice;
	
	private static final Logger logger = Logger.getLogger(ProductController.class);

	@RequestMapping(produces = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<Integer> insertProduct(@RequestBody Product product) {
		productservice.insertProduct(product);
		logger.info("Product has been created with the description : "+product.getDescription());
		return new ResponseEntity<Integer>(product.getProductId(), HttpStatus.OK);
	}
	
	@RequestMapping(produces = { "application/json" }, method = RequestMethod.PUT)
	public ResponseEntity<Integer> updateProduct(@RequestBody Product product)
	{
		productservice.updateProduct(product);
		logger.info("Product has been updated with the description : "+product.getDescription());
		return new ResponseEntity<Integer>(product.getProductId(),HttpStatus.OK);	
	}

	@RequestMapping(value = "/{id}", produces = { "application/json" }, method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteProductById(int id) {
		this.productservice.deleteProductById(id);
		logger.info("Product has been deleted with the id : "+id);
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}

	@RequestMapping(produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<Product>> getProductsBySearchText(
			@ApiParam(value = "SearchText", required = true) @RequestParam(value = "searchText", required = true) String searchText) {
		return new ResponseEntity<List<Product>>(productservice.getProductsByDescription(searchText), HttpStatus.OK);
	}

	@RequestMapping(value = "/{productId}", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<Product> getProductById(@PathVariable("productId") int productId) {
		return new ResponseEntity<Product>(productservice.getProductById(productId), HttpStatus.OK);
	}
}
