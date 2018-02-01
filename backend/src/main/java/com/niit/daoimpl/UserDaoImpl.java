package com.niit.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.SupplierDao;
import com.niit.dao.UserDao;
import com.niit.model.Cart;
import com.niit.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public User findById(int id) {
		Session session = sessionFactory.openSession();
		User user = (User) session.get(User.class, id);
		session.close();
		return user;
	}

	@Transactional
	public List<User> getAllUsers() {
		Session session = sessionFactory.openSession();
		List<User> user = session.createCriteria(User.class).list();
		session.close();
		return user;

	}

	@Transactional
	public boolean save(User user) {
		try {
			sessionFactory.getCurrentSession().save(user);
			return true;
		} catch (Exception e) {
			System.out.println("Exception arised:" + e);
			return false;
		}

	}

	@Transactional
	public boolean update(User user) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(user);
			return true;
		} catch (Exception e) {
			System.out.println("Exception arised:" + e);
			return false;
		}
	}

	@Transactional
	public boolean delete(User user) {
		try {
			sessionFactory.getCurrentSession().delete(user);
			return true;
		} catch (Exception e) {
			System.out.println("Exception arised:" + e);
			return false;
		}
	}

}
