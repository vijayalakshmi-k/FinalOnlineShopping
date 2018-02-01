package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.CartDao;
import com.niit.dao.ProductDao;
import com.niit.model.Cart;
import com.niit.model.Product;

@Controller
@RequestMapping("/cart")
public class CartController {
	@Autowired
	CartDao cartDao;

	@RequestMapping("/show")
	public ModelAndView showCart(@RequestParam(name = "result", required = false) String result) {
		ModelAndView mv = new ModelAndView("page");
		if (result != null) {
			switch (result) {
			case "updated":
				mv.addObject("message", "Cart has been updated successfully!");
				break;
			case "added":
				mv.addObject("message", "Cart has been added successfully!");
				break;
			case "deleted":
				mv.addObject("message", "Cart has been removed successfully!");
				break;
			case "error":
				mv.addObject("message", "Something went wrong!");
				break;
			}
		}
		mv.addObject("title", "User Cart");
		mv.addObject("userClickShowCart", true);
		mv.addObject("cart", cartDao.getCartItems(user));
		return mv;
	}

	@RequestMapping("/{cartLineId}/update")
	public String updateCart(@PathVariable Cart id, @RequestParam int count) {
		String response = cartDao.update(cart);
		return "redirect:/cart/show?" + response;

	}

	@RequestMapping("/{id}/delete")
	public String updateCart(@PathVariable int id) {
		String response = cartDao.deleteCartItem(cart);
		return "redirect:/cart/show?" + response;

	}

	@RequestMapping("/add/{id}/product")
		public String addCart(@PathVariable int id) {		
			String response = cartDao.addToCart(cart);		
			return "redirect:/cart/show?"+response;
			
		}
