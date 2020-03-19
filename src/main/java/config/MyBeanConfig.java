package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import dao.impl.UserDaoImpl2;
import domain.User;
import service.UserService;

public class MyBeanConfig {
	
	@Bean(name = "user")
	public User getUser() {
		return new User();
	}
	
	@Bean(name = "xuserDao")
	public UserDao getUserDaoImpl() {
		return new UserDaoImpl();
	}
	
	@Bean(name = "auserDao")
	public UserDao getUserDaoImpl2() {
		return new UserDaoImpl2();
	}
	
	@Bean(name = "userService")
	public UserService getUserService() {
		return  new UserService();
	}
	
	
}
