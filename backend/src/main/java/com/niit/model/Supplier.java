package com.niit.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@SuppressWarnings("unused")
@Entity
@Table(name = "Supplier")
public class Supplier implements Serializable {

	private static final long serialVersionUID = 1L;
	@Column(name = "Supplier_ID", nullable = false)
	@Id
	private int id;
	@Column(name = "Supplier_Name", nullable = false)
	private String sup_name;

	/*
	 * @OneToMany(targetEntity=Product.class,mappedBy="supplier") private
	 * Set<Product> product;
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

	public String getSup_name() {
		return sup_name;
	}

	public void setSup_name(String sup_name) {
		this.sup_name = sup_name;
	}

}
