package com.niit.dao;

import java.util.List;

import com.niit.model.Supplier;

public interface SupplierDao {

	public boolean save(Supplier supplier);

	public boolean update(Supplier supplier);

	public Supplier getSupById(int id);

	public boolean delete(Supplier supplier);

	public List<Supplier> getAllSuppliers();

}
