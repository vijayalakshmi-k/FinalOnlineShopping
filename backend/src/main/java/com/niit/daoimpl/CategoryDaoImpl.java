package com.niit.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CategoryDao;
import com.niit.model.Cart;
import com.niit.model.Category;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public boolean save(Category category) {
		try {
			sessionFactory.getCurrentSession().save(category);
			return true;
		} catch (Exception e) {
			System.out.println("Exception arised:" + e);
			return false;
		}
	}

	@Transactional
	public boolean update(Category category) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(category);
			return true;
		} catch (Exception e) {
			System.out.println("Exception arised:" + e);
			return false;
		}
	}

	@Transactional
	public boolean delete(Category category) {
		try {
			sessionFactory.getCurrentSession().delete(category);
			return true;
		} catch (Exception e) {
			System.out.println("Exception arised:" + e);
			return false;
		}
	}

	@Transactional
	public Category findById(int id) {
		Session session = sessionFactory.openSession();
		Category category = (Category) session.get(Category.class, id);
		session.close();
		return category;
	}

	@Transactional
	public List<Category> getAllCategories() {
		Session session = sessionFactory.openSession();
		List<Category> category = session.createCriteria(Category.class).list();
		session.close();
		return category;

	}

}
