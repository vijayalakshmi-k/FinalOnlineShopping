package com.niit.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.OrdersDao;
import com.niit.model.Cart;
import com.niit.model.Orders;

@Repository("ordersDao")
public class OrdersDaoImpl implements OrdersDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public boolean save(Orders order) {
		try {
			sessionFactory.getCurrentSession().save(order);
			return true;
		} catch (Exception e) {
			System.out.println("Exception arised:" + e);
			return false;
		}
	}

	@Transactional
	public boolean update(Orders order) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(order);
			return true;
		} catch (Exception e) {
			System.out.println("Exception arised:" + e);
			return false;
		}
	}

	@Transactional
	public boolean delete(Orders order) {
		try {
			sessionFactory.getCurrentSession().delete(order);
			return true;
		} catch (Exception e) {
			System.out.println("Exception arised:" + e);
			return false;
		}
	}

	@Transactional
	public Orders findById(int id) {
		Session session = sessionFactory.openSession();
		Orders order = (Orders) session.get(Orders.class, id);
		session.close();
		return order;
	}

	@Transactional
	public List<Orders> listallOrders(String username) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Orders where username=:username");
		query.setParameter("username", username);
		List<Orders> listOrderItem = query.list();
		return listOrderItem;
	}

}
