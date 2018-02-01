package com.niit.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.UserDao;

import com.niit.model.User;

public class UserDaoTest {
	static UserDao userDao;

	@BeforeClass
	public static void initialize() {
		AnnotationConfigApplicationContext annotationConfigAppContext = new AnnotationConfigApplicationContext();

		annotationConfigAppContext.scan("com.niit.*");
		annotationConfigAppContext.refresh();
		userDao = (UserDao) annotationConfigAppContext.getBean("userDao");
	}

	@Test

	public void saveTest() {
		User user = new User();
		user.setAddress("stanmore,India");
		user.setEmail("sanju@gmail.com");
		user.setMobno(937750319);
		user.setName("Sanjeev");
		user.setPassword("#uhb68");
		user.setRole("user");
		assertTrue("problem in creating user details", userDao.save(user));

	}

}
