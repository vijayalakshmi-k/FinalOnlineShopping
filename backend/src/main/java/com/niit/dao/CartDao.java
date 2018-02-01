package com.niit.dao;

import java.util.List;

import com.niit.model.Cart;

public interface CartDao {
	
	public boolean addToCart(Cart cart);

	public boolean update(Cart cart);

	public boolean deleteCartItem(Cart cart);

	public List<Cart> getCartItems(String user);

	public Cart findById(int id);
}
