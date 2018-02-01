package com.niit.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "Category")
public class Category implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "Category_Id")
	private int id;
	@Column(name = "Category_Name", nullable = false)
	private String categoryname;

	/*
	 * @OneToMany(targetEntity=Product.class, mappedBy="category") private
	 * Set<Product>product;
	 * 
	 * 
	 * public Set<Product> getProduct() { return product; } public void
	 * setProduct(Set<Product> product) { this.product = product; }
	 */

	// getters and setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

}
