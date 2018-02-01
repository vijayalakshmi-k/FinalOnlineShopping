package com.niit.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ProductDao;
import com.niit.model.Product;

public class ProductDaoTest {

	static ProductDao productDao;

	@BeforeClass
	public static void initialize() {
		AnnotationConfigApplicationContext annotationConfigAppContext = new AnnotationConfigApplicationContext();

		annotationConfigAppContext.scan("com.niit.*");
		annotationConfigAppContext.refresh();
		productDao = (ProductDao) annotationConfigAppContext.getBean("productDao");
	}

	@Ignore
	@Test

	public void addProductTest() {
		Product product = new Product();

		product.setProductname("HTC");
		product.setDescription("HTC became a co-founding member of the Open Handset Alliance(Blue)");
		product.setStock(13);
		product.setPrice(36000);
		product.setManufacturer("Chinese");
		product.setCode("TRK348A");

		assertTrue("problem in creating productItem", productDao.addProduct(product));
	}

	@Test

	public void deleteTest() {
		Product product = new Product();
		product.setId(7);
		product.setProductname("Oneplus");
		product.setDescription(" (Black) ");
		product.setStock(12);
		product.setPrice(30000);
		product.setManufacturer("China");

		assertTrue("problem in deleting productItem", productDao.delete(product));
	}

}
