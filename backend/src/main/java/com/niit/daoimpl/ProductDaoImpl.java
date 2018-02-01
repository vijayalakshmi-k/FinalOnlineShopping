package com.niit.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDao;
import com.niit.model.Cart;
import com.niit.model.Product;

@Repository("productDao")
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public List<Product> getAllProducts() {
		Session session = sessionFactory.openSession();
		List<Product> product = session.createCriteria(Product.class).list();
		session.flush();
		session.close();
		return product;
	}

	@Transactional
	public Product getProductById(int id) {
		Session session = sessionFactory.openSession();
		Product product = (Product) session.get(Product.class, id);
		session.close();
		return product;
	}

	@Transactional
	public boolean delete(Product product) {
		try {
			sessionFactory.getCurrentSession().delete(product);
			return true;
		} catch (Exception e) {
			System.out.println("Exception arised:" + e);
			return false;
		}

	}

	@Transactional
	public boolean addProduct(Product product) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(product);
			return true;
		} catch (Exception e) {
			System.out.println("Exception arised:" + e);
			return false;
		}

	}

	@Transactional
	public boolean update(Product product) {
		try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (Exception e) {
			System.out.println("Exception arised:" + e);
			return false;
		}

	}

}
