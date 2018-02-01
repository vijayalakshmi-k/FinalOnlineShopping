package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.dao.CartDao;
import com.niit.dao.ProductDao;
import com.niit.model.Cart;

@Controller
public class OrderController {
	@Autowired
	CartDao cartDao;
	@Autowired
	ProductDao productDao;

	@RequestMapping("/checkout")
	public String orderConfirm(Model m) {
		String user = SecurityContextHolder.getContext().getAuthentication().getName();
		List<Cart> list = cartDao.getCartItems(user);
		double grandtotal = 0;
		for (Cart cart : list) {
			grandtotal = grandtotal + (cart.getQuantity() * cart.getPrice());
		}
		m.addAttribute("grandtotal", grandtotal);
		m.addAttribute("listCartItem", list);
		return "orderConfirm";
	}

}