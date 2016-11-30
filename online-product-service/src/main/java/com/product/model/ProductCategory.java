package com.product.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.cache.annotation.Cacheable;

/**
 * ProductCategory
 */
@Entity
@Table(name = "PRODUCT_CATEGORY")
@Cacheable
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-09-11T08:53:10.271Z")
public class ProductCategory {

	@Id
	@GeneratedValue
	private Integer categoryId = null;
	private String categoryName = null;

	public ProductCategory categoryId(Integer categoryId) {
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

	public ProductCategory categoryName(String categoryName) {
		this.categoryName = categoryName;
		return this;
	}

	/**
	 * Get categoryName
	 * 
	 * @return categoryName
	 **/
	@ApiModelProperty(value = "")
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ProductCategory productCategory = (ProductCategory) o;
		return Objects.equals(this.categoryId, productCategory.categoryId)
				&& Objects.equals(this.categoryName,
						productCategory.categoryName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(categoryId, categoryName);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProductCategory {\n");

		sb.append("    categoryId: ").append(toIndentedString(categoryId))
				.append("\n");
		sb.append("    categoryName: ").append(toIndentedString(categoryName))
				.append("\n");
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
