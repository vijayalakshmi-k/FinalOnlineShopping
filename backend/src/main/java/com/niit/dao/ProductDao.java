package com.niit.dao;

import java.util.List;

import com.niit.model.Product;

public interface ProductDao {

	public List<Product> getAllProducts();

	public Product getProductById(int id);

	public boolean delete(Product product);

	public boolean addProduct(Product product);

	public boolean update(Product product);

}
