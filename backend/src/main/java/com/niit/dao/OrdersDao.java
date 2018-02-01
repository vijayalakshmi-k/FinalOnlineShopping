package com.niit.dao;

import java.util.List;

import com.niit.model.Orders;

public interface OrdersDao {
	
	public boolean save(Orders order);

	public boolean update(Orders order);

	public boolean delete(Orders order);

	public Orders findById(int id);

	public List<Orders> listallOrders(String username);

}
