package com.niit.dao;

import java.util.List;

import com.niit.model.Category;

public interface CategoryDao {
	
	public boolean save(Category category);

	public boolean update(Category category);

	public boolean delete(Category category);

	public Category findById(int id);

	public List<Category> getAllCategories();
}
