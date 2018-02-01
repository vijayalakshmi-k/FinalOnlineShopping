package com.niit.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.CartDao;
import com.niit.model.Cart;

public class CartDaoTest {

	static CartDao cartDao;

	@BeforeClass
	public static void initialize() {
		AnnotationConfigApplicationContext annotationConfigAppContext = new AnnotationConfigApplicationContext();

		annotationConfigAppContext.scan("com.niit");
		annotationConfigAppContext.refresh();
		cartDao = (CartDao) annotationConfigAppContext.getBean("cartDao");
	}

	@Test
	public void saveTest() {
		Cart cart = new Cart();
		cart.setId(100);
		cart.setPrice(2400);
		cart.setQuantity(2);
		cart.setStatus("Np");
		cart.setUser("sanjeev");
		cart.setProductName("Mobiles");
		assertTrue("problem in creating cartItem", cartDao.addToCart(cart));
	}

}
