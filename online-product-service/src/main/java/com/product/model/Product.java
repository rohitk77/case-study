package com.product.model;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.cache.annotation.Cacheable;

/**
 * Product
 */
@Entity
@Table(name = "PRODUCT")
@Cacheable
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-09-11T08:53:10.271Z")
public class Product {

	@Id
	@GeneratedValue
	private Integer productId = null;

	private Integer vendorId = null;

	private Integer categoryId = null;

	private String description = null;

	private String displayName = null;

	private BigDecimal price = null;

	private Integer stock = null;

	public Product vendorId(Integer vendorId) {
		this.vendorId = vendorId;
		return this;
	}

	/**
	 * Get vendorId
	 * 
	 * @return vendorId
	 **/
	@ApiModelProperty(value = "")
	public Integer getVendorId() {
		return vendorId;
	}

	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}

	public Product categoryId(Integer categoryId) {
		this.categoryId = categoryId;
		return this;
	}

	/**
	 * Get categoryId
	 * 
	 * @return categoryId
	 **/
	@ApiModelProperty(value = "")
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Product productId(Integer productId) {
		this.productId = productId;
		return this;
	}

	/**
	 * Get productId
	 * 
	 * @return productId
	 **/
	@ApiModelProperty(value = "")
	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Product description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of product.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Description of product.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Product displayName(String displayName) {
		this.displayName = displayName;
		return this;
	}

	/**
	 * Display name of product.
	 * 
	 * @return displayName
	 **/
	@ApiModelProperty(value = "Display name of product.")
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Product price(BigDecimal price) {
		this.price = price;
		return this;
	}

	/**
	 * Proce of product
	 * 
	 * @return price
	 **/
	@ApiModelProperty(value = "Proce of product")
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Product stock(Integer stock) {
		this.stock = stock;
		return this;
	}

	/**
	 * Product Availablity
	 * 
	 * @return stock
	 **/
	@ApiModelProperty(value = "Product Availablity")
	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Product product = (Product) o;
		return Objects.equals(this.vendorId, product.vendorId)
				&& Objects.equals(this.categoryId, product.categoryId)
				&& Objects.equals(this.productId, product.productId)
				&& Objects.equals(this.description, product.description)
				&& Objects.equals(this.displayName, product.displayName)
				&& Objects.equals(this.price, product.price)
				&& Objects.equals(this.stock, product.stock);
	}

	@Override
	public int hashCode() {
		return Objects.hash(vendorId, categoryId, productId, description,
				displayName, price, stock);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Product {\n");

		sb.append("    vendorId: ").append(toIndentedString(vendorId))
				.append("\n");
		sb.append("    categoryId: ").append(toIndentedString(categoryId))
				.append("\n");
		sb.append("    productId: ").append(toIndentedString(productId))
				.append("\n");
		sb.append("    description: ").append(toIndentedString(description))
				.append("\n");
		sb.append("    displayName: ").append(toIndentedString(displayName))
				.append("\n");
		sb.append("    price: ").append(toIndentedString(price)).append("\n");
		sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
