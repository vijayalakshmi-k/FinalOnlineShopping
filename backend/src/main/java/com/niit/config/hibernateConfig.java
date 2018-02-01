package com.niit.config;

import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.daoimpl.CartDaoImpl;
import com.niit.daoimpl.CategoryDaoImpl;
import com.niit.daoimpl.OrdersDaoImpl;
import com.niit.daoimpl.ProductDaoImpl;
import com.niit.daoimpl.SupplierDaoImpl;
import com.niit.daoimpl.UserDaoImpl;
import com.niit.model.*;

@SuppressWarnings("unused")
@Configuration
@ComponentScan("com.niit.backend")
@EnableTransactionManagement
public class hibernateConfig { 

	public static Logger logger = Logger.getLogger("hibernateConfig");
	

	@Autowired
	@Bean(name = "dataSource")
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:~/localhost/backend");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		return dataSource;

	}

	private Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.put("hibernate.hbm2ddl.auto", "update");
		return properties;
	}

	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.addAnnotatedClass(User.class);
		sessionBuilder.addAnnotatedClass(Category.class);
		sessionBuilder.addAnnotatedClass(Product.class);
		sessionBuilder.addAnnotatedClass(Supplier.class);
		sessionBuilder.addAnnotatedClass(Orders.class);
		sessionBuilder.addAnnotatedClass(Cart.class);
		return sessionBuilder.buildSessionFactory();
	}

	@Autowired
	@Bean(name = "userDaoImpl")
	public UserDaoImpl getUserDao(SessionFactory sessionFactory) {
		return new UserDaoImpl();
	}

	@Autowired
	@Bean(name = "cartDaoImpl")
	public CartDaoImpl getCartDao(SessionFactory sessionFactory) {
		return new CartDaoImpl();
	}

	@Autowired
	@Bean(name = "categoryDaoImpl")
	public CategoryDaoImpl getCategoryDao(SessionFactory sessionFactory) {
		return new CategoryDaoImpl();
	}

	@Autowired
	@Bean(name = "ordersDaoImpl")
	public OrdersDaoImpl getOrdersDao(SessionFactory sessionFactory) {
		return new OrdersDaoImpl();
	}

	@Autowired
	@Bean(name = "productDaoImpl")
	public ProductDaoImpl getProductDao(SessionFactory sessionFactory) {
		return new ProductDaoImpl();
	}

	@Autowired
	@Bean(name = "supplierDaoImpl")
	public SupplierDaoImpl getSupplierDao(SessionFactory sessionFactory) {
		return new SupplierDaoImpl();
	}

	// TransactionManager Bean
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}

}
