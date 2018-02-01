package com.niit.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.SupplierDao;
import com.niit.model.Cart;
import com.niit.model.Product;
import com.niit.model.Supplier;

@Repository("supplierDao")
public class SupplierDaoImpl implements SupplierDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public Supplier getSupById(int id) {
		Session session = sessionFactory.openSession();
		Supplier supplier = (Supplier) session.get(Supplier.class, id);
		session.close();
		return supplier;
	}

	@Transactional
	public List<Supplier> getAllSuppliers() {
		Session session = sessionFactory.openSession();
		List<Supplier> supplier = session.createCriteria(Supplier.class).list();
		session.close();
		return supplier;
	}

	@Transactional
	public boolean save(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().save(supplier);
			return true;
		} catch (Exception e) {
			System.out.println("Exception arised:" + e);
			return false;
		}
	}

	@Transactional
	public boolean update(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(supplier);
			return true;
		} catch (Exception e) {
			System.out.println("Exception arised:" + e);
			return false;
		}
	}

	@Transactional
	public boolean delete(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		} catch (Exception e) {
			System.out.println("Exception arised:" + e);
			return false;
		}
	}

}
