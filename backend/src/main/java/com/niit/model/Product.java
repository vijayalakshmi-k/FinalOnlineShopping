package com.niit.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "Product")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Product_Id")
	private int id;

	@Column(name = "Product_Name")
	@NotEmpty(message = "Product Name is mandatory")
	private String productname;

	private String description;

	@NotNull(message = "Please provide some price")
	private double price;

	private int stock;
	private String code;
	@Transient
	@Column(name = "Image")
	private MultipartFile image;

	// getters and setters

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	private String manufacturer;
	private int view;

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	// to string method

	@Override
	public String toString() {
		return "Product [id=" + id + ", productname=" + productname + ", description=" + description + ", price="
				+ price + ", stock=" + stock + ", code=" + code + ", manufacturer=" + manufacturer + ", view=" + view
				+ ", image=" + image + "]";
	}

	public Product() {

		this.code = "PRD" + UUID.randomUUID().toString().substring(26).toUpperCase();

	}

}
